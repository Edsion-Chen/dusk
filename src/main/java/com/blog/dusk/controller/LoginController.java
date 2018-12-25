package com.blog.dusk.controller;

import com.blog.dusk.Repository.LoginRepository;
import com.blog.dusk.entity.login;
import com.blog.dusk.mapper.loginMapper;
import com.blog.dusk.utils.DateUtil;
import com.blog.dusk.utils.GetTruthIpAddress;
import com.blog.dusk.utils.WebMvcConfg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
    loginMapper loginMapper;

    @RequestMapping("findall")
    public List<login> findAll(){
        List<login> logins = loginDao.findAll();
        return logins;
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request,HttpServletResponse response,HttpSession session){
        String phone = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        login login = loginMapper.findbyphone(phone);
        //非空判断
        if(login != null){
            if(pwd.equals(login.getuPwd()) && phone.equals(login.getuPhone())){

                //登陆成功存储用户的sessionKey
                Cookie c1 = new Cookie("loginName", phone);
                c1.setPath("/");
                response.addCookie(c1);
                session.setAttribute("user", WebMvcConfg.SESSION_KEY);
                try {
                    //登录成功时 更新用户的ip
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


    @RequestMapping("loginout")
    public String loginout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "index.html";
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
//      转String 为 int
//      String s = request.getParameter("");
        String uName = request.getParameter("name");
        String uSex = request.getParameter("sex");
        String uAge = request.getParameter("age");
        String uPhone = request.getParameter("phone");
        String uAddress = request.getParameter("address");
        String uType = request.getParameter("type");
        String pwd = request.getParameter("pwd");
        Date uLastlogintime = DateUtil.getDateTime();
        String uLastamount = "0";
        String uLastloginip = "127.0.0.1";

        login login = new login();
        login.setuName(uName);
        login.setuNickname(uName);
        login.setuPwd(pwd);
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
