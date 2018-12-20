package com.blog.dusk.controller;

import com.blog.dusk.entity.customer;
import com.blog.dusk.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerMapper customerMapper;

    @RequestMapping("findall")
    public List<customer> findallcustomer(){
        List<customer> list = customerMapper.findallcustomer();
        return list;
    }
}
