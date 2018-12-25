package com.blog.dusk.mapper;

import com.blog.dusk.domain.AmountDto;
import com.blog.dusk.domain.PersonDto;
import com.blog.dusk.entity.transaction;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface transactionMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(transaction record);

    int insertSelective(transaction record);

    transaction selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(transaction record);

    int updateByPrimaryKey(transaction record);

    List<AmountDto> selectCurrentYearAmount(String year);

    List<PersonDto> listPersonAmount(String year);
}