package com.blog.dusk.mapper;

import com.blog.dusk.entity.customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerMapper {
    void deleteByPrimaryKey(int cId);

    List<customer> findallcustomer();
}
