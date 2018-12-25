package com.blog.dusk.controller;

import com.blog.dusk.Repository.TransactionRepository;
import com.blog.dusk.domain.AmountDto;
import com.blog.dusk.domain.PersonDto;
import com.blog.dusk.mapper.transactionMapper;
import com.blog.dusk.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.util.*;

@RestController
@RequestMapping("transaction")
public class TransactionController {

    @Autowired
    transactionMapper transactionMapper;

    @Autowired
    TransactionRepository transactionRepository;

    /**
     * 按月份获取当年的营业额
     * @return
     */
    @RequestMapping("listAmount")
    public List<AmountDto> listAmount(){
        String year = DateUtil.getCurrYear();
        List<AmountDto> list = transactionMapper.selectCurrentYearAmount(year);

        //将list按照字段排序
        Collections.sort(list, new Comparator<AmountDto>(){
            /*
             * int compare(AmountDto p1, AmountDto p2) 返回一个基本类型的整型，
             * 返回负数表示：p1 小于p2，
             * 返回0 表示：p1和p2相等，
             * 返回正数表示：p1大于p2
             */
            public int compare(AmountDto p1, AmountDto p2) {
                int month1 = Integer.valueOf(p1.getMonth());
                int month2 = Integer.valueOf(p2.getMonth());
                //按照Person的年龄进行升序排列
                if(month1 > month2 ){
                    return 1;
                }
                if(month1 == month2){
                    return 0;
                }
                return -1;
            }
        });
        //System.out.println("排序后:"+list);
        return list;
    }

    @RequestMapping("listPersonAmount")
    public List<PersonDto> listPersonAmount(){
        String year = DateUtil.getCurrYear();
        List<PersonDto> list = transactionMapper.listPersonAmount(year);
        return list;
    }
}
