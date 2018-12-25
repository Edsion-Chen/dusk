package com.blog.dusk.controller;

import com.blog.dusk.entity.goods;
import com.blog.dusk.mapper.goodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    goodsMapper goodsMapper;

//    @RequestMapping("listgoods")
//    public List<goods> listgoods(){
//
//        return
//    }
}
