package com.blog.dusk.mapper;

import com.blog.dusk.entity.goods;
import org.springframework.stereotype.Component;

@Component
public interface goodsMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(goods record);

    int insertSelective(goods record);

    goods selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(goods record);

    int updateByPrimaryKey(goods record);
}