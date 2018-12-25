package com.blog.dusk.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    /**
     * String 转 Date
     * @param date
     * @return
     * @throws ParseException
     */
    public static Date StringToDate(String date) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = sdf.parse(date);
        return time;
    }

    /**
     * 获取String类型时间
     * @return
     */
    public static String getTime(){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        String time = dateFormat.format(date);
        return time;
    }

    /**
     * 获取date类型时间
     * @return
     * @throws ParseException
     */
    public static Date getDateTime() throws ParseException{
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowdayTime = dateFormat.format(new Date());
        Date nowDate = dateFormat.parse(nowdayTime);
        return nowDate;
    }

    /**
     * 获取当前年份
     * @return
     */
    public static String getCurrYear(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        String currTime = format.format(Calendar.getInstance().getTime());
        return currTime;
    }

}
