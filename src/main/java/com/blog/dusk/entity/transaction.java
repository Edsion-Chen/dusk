package com.blog.dusk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class transaction {
    @Id
    @GeneratedValue
    @Column(name = "t_id")
    private Integer tId;

    @Column(name = "t_servername")
    private String tServername;

    @Column(name = "t_customername")
    private String tCustomername;

    @Column(name = "t_customerid")
    private Integer tCustomerid;

    @Column(name = "t_paytype")
    private String tPaytype;

    @Column(name = "t_amount")
    private Double tAmount;

    @Column(name = "t_stock")
    private Double tStock;

    @Column(name = "t_dissipate")
    private Date tDissipate;

    @Column(name = "t_operatorname")
    private String tOperatorname;

    @Column(name = "t_operatorid")
    private Integer tOperatorid;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettServername() {
        return tServername;
    }

    public void settServername(String tServername) {
        this.tServername = tServername == null ? null : tServername.trim();
    }

    public String gettCustomername() {
        return tCustomername;
    }

    public void settCustomername(String tCustomername) {
        this.tCustomername = tCustomername == null ? null : tCustomername.trim();
    }

    public Integer gettCustomerid() {
        return tCustomerid;
    }

    public void settCustomerid(Integer tCustomerid) {
        this.tCustomerid = tCustomerid;
    }

    public String gettPaytype() {
        return tPaytype;
    }

    public void settPaytype(String tPaytype) {
        this.tPaytype = tPaytype == null ? null : tPaytype.trim();
    }

    public Double gettAmount() {
        return tAmount;
    }

    public void settAmount(Double tAmount) {
        this.tAmount = tAmount;
    }

    public Double gettStock() {
        return tStock;
    }

    public void settStock(Double tStock) {
        this.tStock = tStock;
    }

    public Date gettDissipate() {
        return tDissipate;
    }

    public void settDissipate(Date tDissipate) {
        this.tDissipate = tDissipate;
    }

    public String gettOperatorname() {
        return tOperatorname;
    }

    public void settOperatorname(String tOperatorname) {
        this.tOperatorname = tOperatorname == null ? null : tOperatorname.trim();
    }

    public Integer gettOperatorid() {
        return tOperatorid;
    }

    public void settOperatorid(Integer tOperatorid) {
        this.tOperatorid = tOperatorid;
    }
}