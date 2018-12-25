package com.blog.dusk.controller;

import com.blog.dusk.entity.customer;
import com.blog.dusk.entity.goods;
import com.blog.dusk.mapper.goodsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    goodsMapper goodsMapper;

    @RequestMapping("page")
    public PageInfo<goods> page(Integer pageNum, Integer pageSize) {
        pageNum = pageNum != null ? pageNum : 1;
        pageSize = pageSize != null ? pageSize : 5;
        PageHelper.startPage(pageNum, pageSize);
        List<goods> list = goodsMapper.selectGoodsList();
        PageInfo<goods> pageInfo = new PageInfo<goods>(list);
        pageInfo.setPageSize(pageSize);
        pageInfo.setPageNum(pageNum);
        return pageInfo;
    }


}
