/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.vo;

import java.math.BigDecimal;

/**
 *
 * @author Administrator
 */
public class ViewPro {
    private Integer proid;
    private String proname;
    private String type;
    private Integer totalpurcount;
    private BigDecimal totalpurmoney;
    private Integer totalselcount;
    private BigDecimal totalselmoney;
    
    public ViewPro(){
        
    }

    public ViewPro(Integer proid, String proname, String type, Integer totalpurcount, BigDecimal totalpurmoney, Integer totalselcount, BigDecimal totalselmoney) {
        this.proid = proid;
        this.proname = proname;
        this.type = type;
        this.totalpurcount = totalpurcount;
        this.totalpurmoney = totalpurmoney;
        this.totalselcount = totalselcount;
        this.totalselmoney = totalselmoney;
    }

    public Integer getProid() {
        return proid;
    }

    public String getProname() {
        return proname;
    }

    public String getType() {
        return type;
    }

    public Integer getTotalpurcount() {
        return totalpurcount;
    }

    public BigDecimal getTotalpurmoney() {
        return totalpurmoney;
    }

    public Integer getTotalselcount() {
        return totalselcount;
    }

    public BigDecimal getTotalselmoney() {
        return totalselmoney;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTotalpurcount(Integer totalpurcount) {
        this.totalpurcount = totalpurcount;
    }

    public void setTotalpurmoney(BigDecimal totalpurmoney) {
        this.totalpurmoney = totalpurmoney;
    }

    public void setTotalselcount(Integer totalselcount) {
        this.totalselcount = totalselcount;
    }

    public void setTotalselmoney(BigDecimal totalselmoney) {
        this.totalselmoney = totalselmoney;
    }

    @Override
    public String toString() {
        return "ViewPro{" + "proid=" + proid + ", proname=" + proname + ", type=" + type + ", totalpurcount=" + totalpurcount + ", totalpurmoney=" + totalpurmoney + ", totalselcount=" + totalselcount + ", totalselmoney=" + totalselmoney + '}';
    }
    
    
}
