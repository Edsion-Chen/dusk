package com.blog.dusk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class customer {
    @Id
    @GeneratedValue
    @Column(name = "c_id")
    private Integer cId;

    @Column(name = "c_name")
    private String cName;

    @Column(name = "c_sex")
    private String cSex;

    @Column(name = "c_age")
    private String cAge;

    @Column(name = "c_address")
    private String cAddress;

    @Column(name = "c_type")
    private String cType;

    @Column(name = "c_wechat")
    private String cWechat;

    @Column(name = "c_qq")
    private String cQq;

    @Column(name = "c_phone")
    private String cPhone;

    @Column(name = "c_balance")
    private String cBalance;

    @Column(name = "c_lastpaymoney")
    private Double cLastpaymoney;

    @Column(name = "c_lastpaytime")
    private Date cLastpaytime;

    @Column(name = "c_lastpaybyway")
    private String cLastpaybyway;

    @Column(name = "ylzd")
    private String ylzd;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcSex() {
        return cSex;
    }

    public void setcSex(String cSex) {
        this.cSex = cSex == null ? null : cSex.trim();
    }

    public String getcAge() {
        return cAge;
    }

    public void setcAge(String cAge) {
        this.cAge = cAge == null ? null : cAge.trim();
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress == null ? null : cAddress.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    public String getcWechat() {
        return cWechat;
    }

    public void setcWechat(String cWechat) {
        this.cWechat = cWechat == null ? null : cWechat.trim();
    }

    public String getcQq() {
        return cQq;
    }

    public void setcQq(String cQq) {
        this.cQq = cQq == null ? null : cQq.trim();
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone == null ? null : cPhone.trim();
    }

    public String getcBalance() {
        return cBalance;
    }

    public void setcBalance(String cBalance) {
        this.cBalance = cBalance == null ? null : cBalance.trim();
    }

    public Double getcLastpaymoney() {
        return cLastpaymoney;
    }

    public void setcLastpaymoney(Double cLastpaymoney) {
        this.cLastpaymoney = cLastpaymoney;
    }

    public Date getcLastpaytime() {
        return cLastpaytime;
    }

    public void setcLastpaytime(Date cLastpaytime) {
        this.cLastpaytime = cLastpaytime;
    }

    public String getcLastpaybyway() {
        return cLastpaybyway;
    }

    public void setcLastpaybyway(String cLastpaybyway) {
        this.cLastpaybyway = cLastpaybyway == null ? null : cLastpaybyway.trim();
    }

    public String getYlzd() {
        return ylzd;
    }

    public void setYlzd(String ylzd) {
        this.ylzd = ylzd == null ? null : ylzd.trim();
    }
}