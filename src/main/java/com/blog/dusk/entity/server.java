package com.blog.dusk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class server {
    @Id
    @GeneratedValue
    @Column(name = "s_id")
    private Integer sId;

    @Column(name = "s_name")
    private String sName;

    @Column(name = "s_price")
    private String sPrice;

    @Column(name = "s_stock")
    private String sStock;

    @Column(name = "s_beauticianname")
    private String sBeauticianname;

    @Column(name = "s_beauticianid")
    private String sBeauticianid;

    @Column(name = "s_cost")
    private String sCost;

    @Column(name = "s_duration")
    private String sDuration;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPrice() {
        return sPrice;
    }

    public void setsPrice(String sPrice) {
        this.sPrice = sPrice == null ? null : sPrice.trim();
    }

    public String getsStock() {
        return sStock;
    }

    public void setsStock(String sStock) {
        this.sStock = sStock == null ? null : sStock.trim();
    }

    public String getsBeauticianname() {
        return sBeauticianname;
    }

    public void setsBeauticianname(String sBeauticianname) {
        this.sBeauticianname = sBeauticianname == null ? null : sBeauticianname.trim();
    }

    public String getsBeauticianid() {
        return sBeauticianid;
    }

    public void setsBeauticianid(String sBeauticianid) {
        this.sBeauticianid = sBeauticianid == null ? null : sBeauticianid.trim();
    }

    public String getsCost() {
        return sCost;
    }

    public void setsCost(String sCost) {
        this.sCost = sCost == null ? null : sCost.trim();
    }

    public String getsDuration() {
        return sDuration;
    }

    public void setsDuration(String sDuration) {
        this.sDuration = sDuration == null ? null : sDuration.trim();
    }
}