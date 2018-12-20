package com.wmyskxz.springboot.mapper;

import com.blog.dusk.entity.customer;

public interface customerMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(customer record);

    int insertSelective(customer record);

    customer selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(customer record);

    int updateByPrimaryKey(customer record);
}