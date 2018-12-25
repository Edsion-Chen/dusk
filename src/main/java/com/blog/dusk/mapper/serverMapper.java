package com.blog.dusk.mapper;

import com.blog.dusk.entity.server;
import org.springframework.stereotype.Component;

@Component
public interface serverMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(server record);

    int insertSelective(server record);

    server selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(server record);

    int updateByPrimaryKey(server record);
}