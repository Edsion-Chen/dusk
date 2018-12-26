package com.blog.dusk.controller;

import com.blog.dusk.entity.customer;
import com.blog.dusk.entity.goods;
import com.blog.dusk.mapper.goodsMapper;
import com.blog.dusk.utils.CodeStatus;
import com.blog.dusk.utils.DateUtil;
import com.blog.dusk.utils.GetCurrentUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.time.DateTimeException;
import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    goodsMapper goodsMapper;

    /**
     * 商品分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("page")
    public PageInfo<goods> page(Integer pageNum, Integer pageSize) {
        pageNum = pageNum != null ? pageNum : 1;
        pageSize = pageSize != null ? pageSize : 5;
        PageHelper.startPage(pageNum, pageSize);
        List<goods> list = goodsMapper.selectGoodsList();
        PageInfo<goods> pageInfo = new PageInfo<goods>(list);
        pageInfo.setPageSize(pageSize);
        pageInfo.setPageNum(pageNum);
        return pageInfo;
    }

    /**
     * 添加商品
     * @param request
     * @return
     */
    @RequestMapping("Addgoods")
    public String goodsAdd(HttpServletRequest request){
        String gName = request.getParameter("name");
        String gInserttime = request.getParameter("time");
        String gCost = request.getParameter("cost");
        String gSale = request.getParameter("sale");
        String gDiscount = request.getParameter("discount");
        String gStock = request.getParameter("stock");
        String gService = request.getParameter("service");

        return "";
    }

    /**
     * 更新商品
     */
    @RequestMapping("updateGoods")
    @Transactional
    public String updateByPrimaryKey(HttpServletRequest request) throws ParseException {
        String gName = request.getParameter("name");
//        String gName = name.substring(0,name.length()-1);
        String Id = request.getParameter("id");
//        String Id = s.substring(0,s.length()-1);
        int gId = 0;
        if(Id != "" && Id != null){
            gId = Integer.parseInt(Id.trim());
        }
        String gC = request.getParameter("cost");
//        String gC = c.substring(0,c.length()-1);
        Double gCost = 0.00;
        if(gC != null && gC != ""){
            gCost = Double.valueOf(gC);
        }

        String sale = request.getParameter("sale");
//        String sale = s1.substring(0,s1.length()-1);
        Double gSale = 0.00;
        if(sale != "" && sale != null){
            gSale = Double.valueOf(sale);
        }
        String discot = request.getParameter("discount");
//        String discot = dis.substring(0,dis.length()-1);
        Double gDiscount = 0.00;
        if(discot != null && discot != ""){
            gDiscount = Double.valueOf(discot);
        }
        String gService = request.getParameter("service");
//        String gService = service.substring(0,service.length()-1);
        String Stock = request.getParameter("stock");
//        String Stock = ock.substring(0,ock.length()-1);
        int gStock = 0;
        if(Stock != "" && Stock != null){
            gStock = Integer.valueOf(Stock);
        }

        goods goods = new goods();
        goods.setgId(gId);
        goods.setgCost(gCost);
        goods.setgDiscount(gDiscount);
        goods.setgInserttime(DateUtil.getDateTime());
        goods.setgName(gName);
        goods.setgSale(gSale);
        goods.setgService(gService);
        goods.setgStock(gStock);
        try {
            goodsMapper.updateByPrimaryKey(goods);
            return CodeStatus.CODE_SUCCESS;
        }catch (Exception e){
            return CodeStatus.CODE_FAILURE;
        }
    }

    /**
     * 删除商品
     */
    @RequestMapping("deleteGoods")
    @Transactional
    public String deleteById(HttpServletRequest request){
        String s = request.getParameter("id");
        int gId = 0;
        if(!(s.equals("")) && s != null){
            gId = Integer.valueOf(s);
        }
        try {
            goodsMapper.deleteById(gId);
            return CodeStatus.CODE_SUCCESS;
        }catch (Exception e){
            return CodeStatus.CODE_FAILURE;
        }
    }

}
