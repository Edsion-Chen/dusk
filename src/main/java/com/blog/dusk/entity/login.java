package com.blog.dusk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class login {
    @Id
    @GeneratedValue
    @Column(name = "uid")
    private Integer uid;

    @Column(name = "u_name")
    private String uName;

    @Column(name = "u_sex")
    private String uSex;

    @Column(name = "u_age")
    private String uAge;

    @Column(name = "u_phone")
    private String uPhone;

    @Column(name = "u_address")
    private String uAddress;

    @Column(name = "u_type")
    private String uType;

    @Column(name = "u_nickname")
    private String uNickname;

    @Column(name = "u_isdelete")
    private String uIsdelete;

    @Column(name = "u_isadmin")
    private String uIsadmin;

    @Column(name = "u_lastlogintime")
    private Date uLastlogintime;

    @Column(name = "u_lastamount")
    private String uLastamount;

    @Column(name = "u_lastloginip")
    private String uLastloginip;

    @Column(name = "u_pwd")
    private String uPwd;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuAge() {
        return uAge;
    }

    public void setuAge(String uAge) {
        this.uAge = uAge == null ? null : uAge.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType == null ? null : uType.trim();
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    public String getuIsdelete() {
        return uIsdelete;
    }

    public void setuIsdelete(String uIsdelete) {
        this.uIsdelete = uIsdelete == null ? null : uIsdelete.trim();
    }

    public String getuIsadmin() {
        return uIsadmin;
    }

    public void setuIsadmin(String uIsadmin) {
        this.uIsadmin = uIsadmin == null ? null : uIsadmin.trim();
    }

    public Date getuLastlogintime() {
        return uLastlogintime;
    }

    public void setuLastlogintime(Date uLastlogintime) {
        this.uLastlogintime = uLastlogintime;
    }

    public String getuLastamount() {
        return uLastamount;
    }

    public void setuLastamount(String uLastamount) {
        this.uLastamount = uLastamount == null ? null : uLastamount.trim();
    }

    public String getuLastloginip() {
        return uLastloginip;
    }

    public void setuLastloginip(String uLastloginip) {
        this.uLastloginip = uLastloginip == null ? null : uLastloginip.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }
}