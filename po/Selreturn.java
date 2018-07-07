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
public class Selreturn {
    	private Integer srtid; // 销售退货编号
	private Integer selid; // 销售编号
	private Integer proid; // 商品编号
	private String proname; // 商品名称
	private Integer empid; // 员工编号
	private String ename; // 员工名称
	private Integer cusid; // 买家编号
	private String cusname; // 买家昵称
	private Date srtdate; // 退货日期
	private Integer srtcount;// 退货数量
	private BigDecimal srtprice; // 退货单价
	private BigDecimal srttotal; // 退货总金额
	
	public Selreturn(){
		
	}

	public Selreturn(Integer srtid, Integer selid, Integer proid, String proname, Integer empid, String ename,
			Integer cusid, String cusname, Date srtdate, Integer srtcount, BigDecimal srtprice, BigDecimal srttotal) {
		super();
		this.srtid = srtid;
		this.selid = selid;
		this.proid = proid;
		this.proname = proname;
		this.empid = empid;
		this.ename = ename;
		this.cusid = cusid;
		this.cusname = cusname;
		this.srtdate = srtdate;
		this.srtcount = srtcount;
		this.srtprice = srtprice;
		this.srttotal = srttotal;
	}

	public Integer getSrtid() {
		return srtid;
	}

	public void setSrtid(Integer srtid) {
		this.srtid = srtid;
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

	public Date getSrtdate() {
		return srtdate;
	}

	public void setSrtdate(Date srtdate) {
		this.srtdate = srtdate;
	}

	public Integer getSrtcount() {
		return srtcount;
	}

	public void setSrtcount(Integer srtcount) {
		this.srtcount = srtcount;
	}

	public BigDecimal getSrtprice() {
		return srtprice;
	}

	public void setSrtprice(BigDecimal srtprice) {
		this.srtprice = srtprice;
	}

	public BigDecimal getSrttotal() {
		return srttotal;
	}

	public void setSrttotal(BigDecimal srttotal) {
		this.srttotal = srttotal;
	}

	@Override
	public String toString() {
		return "Selreturn [srtid=" + srtid + ", selid=" + selid + ", proid=" + proid + ", proname=" + proname
				+ ", empid=" + empid + ", ename=" + ename + ", cusid=" + cusid + ", cusname=" + cusname + ", srtdate="
				+ srtdate + ", srtcount=" + srtcount + ", srtprice=" + srtprice + ", srttotal=" + srttotal + "]";
	}
	
}
