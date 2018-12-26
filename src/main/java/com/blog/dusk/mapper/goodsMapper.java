package com.blog.dusk.mapper;

import com.blog.dusk.entity.goods;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface goodsMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(goods record);

    int insertSelective(goods record);

    goods selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(goods record);

    /**
     * 更新
     * @param record
     */
    void updateByPrimaryKey(goods record);

    /**
     * 查询列表
     * @return
     */
    List<goods> selectGoodsList();

    /**
     * 增加商品
     * @param goods
     */
    void insertGoods(goods goods);

    /**根据id删除
     * @param gId
     */
    void deleteById(Integer gId);
}