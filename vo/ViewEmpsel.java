/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.vo;

import java.math.BigDecimal;

/**
 *
 * @author LIUYIYU
 */

import java.math.BigDecimal;

public class ViewEmpsel {
    private Integer empid;
    private Integer mon; 
    private String ename;
    private Integer totalcount;
    private BigDecimal totalprice;

    public ViewEmpsel(){
        
    }

	public ViewEmpsel(Integer empid, Integer mon, String ename, Integer totalcount, BigDecimal totalprice) {
		super();
		this.empid = empid;
		this.mon = mon;
		this.ename = ename;
		this.totalcount = totalcount;
		this.totalprice = totalprice;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public Integer getMon() {
		return mon;
	}

	public void setMon(Integer mon) {
		this.mon = mon;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(Integer totalcount) {
		this.totalcount = totalcount;
	}

	public BigDecimal getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}

	@Override
	public String toString() {
		return "ViewEmp [empid=" + empid + ", mon=" + mon + ", ename=" + ename + ", totalcount=" + totalcount
				+ ", totalprice=" + totalprice + "]";
	}


}