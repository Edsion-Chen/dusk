package com.blog.dusk.controller;

import com.blog.dusk.Repository.LoginRepository;
import com.blog.dusk.entity.Login;
import com.blog.dusk.mapper.LoginMapper;
import com.blog.dusk.utils.CodeStatus;
import com.blog.dusk.utils.DateUtil;
import com.blog.dusk.utils.GetTruthIpAddress;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.blog.dusk.utils.CodeStatus.CODE_FAILURE;
import static com.blog.dusk.utils.CodeStatus.CODE_SUCCESS;

@RestController
@RequestMapping("login")
@EnableAutoConfiguration
public class LoginController {

    @Autowired
    LoginRepository loginDao;

    @Autowired
    LoginMapper loginMapper;

    @RequestMapping("findall")
    public List<Login> findAll(){
        List<Login> logins = loginDao.findAll();
        return logins;
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request,HttpServletResponse response){
        String phone = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        Map<String,Object> map = loginMapper.findbyphone(phone);
        //非空判断
        if(!(map.size() < 1) && !(map == null) && pwd.equals("admin123.")){
            if(phone.equals(map.get("u_phone"))){
                //登录成功时 更新用户的ip
                try {
                    String ip = GetTruthIpAddress.getIpAddress(request);
                    Map<String,Object> map1 = new HashMap<>();
                    map1.put("ip",ip);
                    map1.put("phone",phone);
                    loginMapper.updateUserLoginIp(map1);
                }catch (Exception e){
                    System.out.println(e);
                }
                return "Y";
            }else {
                return "N";
            }
        }else {
            return "NULL";
        }
    }

    /**
     * 注册
     * @param request
     * @param response
     * @return
     * @throws ParseException
     */
    @RequestMapping("signup")
    public String signup(HttpServletRequest request,HttpServletResponse response) throws ParseException{
        String code = CODE_SUCCESS;
       try{
//        //转String 为 int
//        String s = request.getParameter("");
        String uName = request.getParameter("name");
        String uSex = request.getParameter("sex");
        String uAge = request.getParameter("age");
        String uPhone = request.getParameter("phone");
        String uAddress = request.getParameter("address");
        String uType = request.getParameter("type");
        Date uLastlogintime = DateUtil.getDateTime();
        String uLastamount = "0";
        String uLastloginip = "127.0.0.1";

        Login login = new Login();
        login.setuName(uName);
        login.setuNickname(uName);
        login.setuIsdelete("N");
        login.setuIsadmin("N");
        login.setuSex(uSex);
        login.setuPhone(uPhone);
        login.setuAddress(uAddress);
        login.setuAge(uAge);
        login.setuType(uType);
        login.setuLastlogintime(uLastlogintime);
        login.setuLastamount(uLastamount);
        login.setuLastloginip(uLastloginip);
        loginMapper.insert(login);
       } catch (Exception e){
            code = CODE_FAILURE;
       }
        return code;
    }
}
