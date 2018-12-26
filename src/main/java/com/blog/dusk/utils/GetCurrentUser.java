package com.blog.dusk.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class GetCurrentUser {

    public String getCookies(HttpServletRequest request){
//      获取request里面的cookie cookie里面存值方式也是 键值对的方式 
        Cookie[] cookie = request.getCookies();
        Cookie cook = null;
        for (int i = 0; i < cookie.length; i++) {
               cook = cookie[i];
            if(cook.getName().equalsIgnoreCase("eredg4.login.account")){ //获取键 
                System.out.println("account:"+cook.getValue().toString()); //获取值 
            }
        }
        return cook.getValue().toString();
    }
}
