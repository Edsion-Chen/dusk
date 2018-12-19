package com.blog.dusk.controller;

import com.blog.dusk.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class IndexController {
    @Autowired
    LoginMapper loginMapper;

    @RequestMapping("histogram")
    public String histogram(){

        return "";
    }
}
