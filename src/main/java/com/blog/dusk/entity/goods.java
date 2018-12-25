package com.blog.dusk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class goods {
    @Id
    @GeneratedValue
    @Column(name = "g_id")
    private Integer gId;

    @Column(name = "g_name")
    private String gName;

    @Column(name = "g_inserttime")
    private Date gInserttime;

    @Column(name = "g_cost")
    private Double gCost;

    @Column(name = "g_sale")
    private Double gSale;

    @Column(name = "g_Discount")
    private Double gDiscount;

    @Column(name = "g_Stock")
    private Integer gStock;

    @Column(name = "g_service")
    private String gService;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Date getgInserttime() {
        return gInserttime;
    }

    public void setgInserttime(Date gInserttime) {
        this.gInserttime = gInserttime;
    }

    public Double getgCost() {
        return gCost;
    }

    public void setgCost(Double gCost) {
        this.gCost = gCost;
    }

    public Double getgSale() {
        return gSale;
    }

    public void setgSale(Double gSale) {
        this.gSale = gSale;
    }

    public Double getgDiscount() {
        return gDiscount;
    }

    public void setgDiscount(Double gDiscount) {
        this.gDiscount = gDiscount;
    }

    public Integer getgStock() {
        return gStock;
    }

    public void setgStock(Integer gStock) {
        this.gStock = gStock;
    }

    public String getgService() {
        return gService;
    }

    public void setgService(String gService) {
        this.gService = gService == null ? null : gService.trim();
    }
}