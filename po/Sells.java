/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Sells {
    	private Integer selid; // 销售编号
	private Integer proid; // 商品编号
	private String proname; // 商品名称
	private Integer empid; // 员工编号
	private String ename; // 员工名称
	private Integer cusid; // 买家编号
	private String cusname; // 买家昵称
	private Date seldate; // 销售日期
	private Integer selcount;// 销售数量
	private BigDecimal selprice; // 销售单价
	private BigDecimal seltotal; // 销售总金额
	public Sells(Integer selid, Integer proid, String proname, Integer empid, String ename, Integer cusid,
			String cusname, Date seldate, Integer selcount, BigDecimal selprice, BigDecimal seltotal) {
		super();
		this.selid = selid;
		this.proid = proid;
		this.proname = proname;
		this.empid = empid;
		this.ename = ename;
		this.cusid = cusid;
		this.cusname = cusname;
		this.seldate = seldate;
		this.selcount = selcount;
		this.selprice = selprice;
		this.seltotal = seltotal;
	}
	public Integer getSelid() {
		return selid;
	}
	public void setSelid(Integer selid) {
		this.selid = selid;
	}
	public Integer getProid() {
		return proid;
	}
	public void setProid(Integer proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getCusid() {
		return cusid;
	}
	public void setCusid(Integer cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public Date getSeldate() {
		return seldate;
	}
	public void setSeldate(Date seldate) {
		this.seldate = seldate;
	}
	public Integer getSelcount() {
		return selcount;
	}
	public void setSelcount(Integer selcount) {
		this.selcount = selcount;
	}
	public BigDecimal getSelprice() {
		return selprice;
	}
	public void setSelprice(BigDecimal selprice) {
		this.selprice = selprice;
	}
	public BigDecimal getSeltotal() {
		return seltotal;
	}
	public void setSeltotal(BigDecimal seltotal) {
		this.seltotal = seltotal;
	}
	
	public String toString() {
		return "Sells [selid=" + selid + ", proid=" + proid + ", proname=" + proname + ", empid=" + empid
				+ ", ename=" + ename + ", cusid=" + cusid + ", cusname=" + cusname + ", seldate=" + seldate
				+ ", selcount=" + selcount + ", selprice=" + selprice + ", seltotal=" + seltotal + "]";
	}
	
}
