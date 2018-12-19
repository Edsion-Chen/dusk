package com.blog.dusk.controller;

import com.blog.dusk.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@Controller
public class HelloController {

    @Autowired
    LoginRepository loginDao;

    /**跳转页面到首页
     * @return
     */
    @RequestMapping("/")
    public String hello(){
        return "/index";
    }
}
