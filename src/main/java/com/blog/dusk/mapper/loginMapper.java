package com.blog.dusk.mapper;

import com.blog.dusk.entity.login;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public interface loginMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(login record);

    int insertSelective(login record);

    login selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(login record);

    int updateByPrimaryKey(login record);

    void updateUserLoginIp(Map<String,Object> map);

    login findbyphone(String phone);
}