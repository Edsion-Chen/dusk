package com.blog.dusk.mapper;

import com.blog.dusk.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public interface LoginMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);

    /**
     * 以手机号为唯一标识,登录
     * @param phone
     * @return
     */
    Map<String,Object> findbyphone(@Param("phone") String phone);

    /**
     * 登陆成功 更新当前用户登录ip
     * @param map
     * @return
     */
    void updateUserLoginIp(Map<String,Object> map);
}