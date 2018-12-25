package com.blog.dusk.controller;

import com.blog.dusk.Repository.CustomerRepository;
import com.blog.dusk.entity.customer;
import com.blog.dusk.mapper.customerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    customerMapper customerMapper;

    @RequestMapping("findall")
    public List<customer> findall(){
        List<customer> list = customerRepository.findAll();
        return list;
    }

    /**
     * 使用pagehelper分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("page")
    public PageInfo<customer> page(Integer pageNum, Integer pageSize) {
        pageNum = pageNum != null ? pageNum : 1;
        pageSize = pageSize != null ? pageSize : 5;
        PageHelper.startPage(pageNum, pageSize);
        List<customer> list = customerRepository.findAll();
        PageInfo<customer> pageInfo = new PageInfo<customer>(list);
        pageInfo.setPageSize(pageSize);
        pageInfo.setPageNum(pageNum);
        return pageInfo;
    }
}
