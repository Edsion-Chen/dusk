package com.blog.dusk.mapper;

import com.blog.dusk.entity.customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface customerMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(customer record);

    int insertSelective(customer record);

    customer selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(customer record);

    int updateByPrimaryKey(customer record);

    List<customer> findallcustomer();
}