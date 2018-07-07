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
public class ViewEmp {
    private Integer empid;
    private String ename;
    private Integer selid;
    private String proname;
    private String type;
    private Integer selcount;
    private BigDecimal selprice;
    private BigDecimal totalprice;

    public ViewEmp(){
        
    }
    
    public ViewEmp(Integer empid, String ename, String proname, String type, Integer selcount, BigDecimal selprice) {
        this.empid = empid;
        this.ename = ename;
        this.proname = proname;
        this.type = type;
        this.selcount = selcount;
        this.selprice = selprice;
    }

    public Integer getEmpid() {
        return empid;
    }

    public String getEname() {
        return ename;
    }

    public Integer getSelid() {
        return selid;
    }

    public String getProname() {
        return proname;
    }

    public String getType() {
        return type;
    }

    public Integer getSelcount() {
        return selcount;
    }

    public BigDecimal getSelprice() {
        return selprice;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSelid(Integer selid) {
        this.selid = selid;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSelcount(Integer selcount) {
        this.selcount = selcount;
    }

    public void setSelprice(BigDecimal selprice) {
        this.selprice = selprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    @Override
    public String toString() {
        return "ViewEmp{" + "empid=" + empid + ", ename=" + ename + ", selid=" + selid + ", proname=" + proname + ", type=" + type + ", selcount=" + selcount + ", selprice=" + selprice + ", totalprice=" + totalprice + '}';
    }
    
    
    
    
}
