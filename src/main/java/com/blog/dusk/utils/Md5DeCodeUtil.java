package com.blog.dusk.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Md5DeCodeUtil {

    /**
     * 实现md5加密
     * @param data
     * @return
     */
    public static String encodeMD5Hex(String data){
        return DigestUtils.md5Hex(data);
    }
}
