/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.po;

import java.math.BigDecimal;

/**
 *purid int primary key auto_increment, -- 采购单号
	proid int not null, -- 外键，商品编号
	supid int not null, -- 外键，供应商编号
	purdate date not null, -- 采购日期
	purcount int not null, -- 采购数量
	purprice float not null, -- 采购单价
	purtotal float not null -- 采购总金额
 * @author LIUYIYU
 */

public class Purchase {
	private int purid;
	private int proid;
	private String proname;
        private int empid;
	private String ename;
	private int supid;
	private String supname;
	private String purdate;
	private int purcount;
	private BigDecimal purprice;
	private BigDecimal purtotal;

	public Purchase() {
		super();
	}

	public Purchase(int purid, int proid, String proname, int empid, String ename, int supid, String supname, String purdate, int purcount,
			BigDecimal purprice, BigDecimal purtotal) {
		super();
		this.purid = purid;
		this.proid = proid;
		this.proname = proname;
                this.empid = empid;
		this.ename = ename;
		this.supid = supid;
		this.supname = supname;
		this.purdate = purdate;
		this.purcount = purcount;
		this.purprice = purprice;
		this.purtotal = purtotal;
	}

	public int getPurid() {
		return purid;
	}

	public void setPurid(int purid) {
		this.purid = purid;
	}

	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

        public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSupid() {
		return supid;
	}

	public void setSupid(int supid) {
		this.supid = supid;
	}

	public String getSupname() {
		return supname;
	}

	public void setSupname(String supname) {
		this.supname = supname;
	}

	public String getPurdate() {
		return purdate;
	}

	public void setPurdate(String purdate) {
		this.purdate = purdate;
	}

	public int getPurcount() {
		return purcount;
	}

	public void setPurcount(int purcount) {
		this.purcount = purcount;
	}

	public BigDecimal getPurprice() {
		return purprice;
	}

	public void setPurprice(BigDecimal purprice) {
		this.purprice = purprice;
	}

	public BigDecimal getPurtotal() {
		return purtotal;
	}

	public void setPurtotal(BigDecimal purtotal) {
		this.purtotal = purtotal;
	}

	@Override
	public String toString() {
		return "Purchase [purid=" + purid + ", proid=" + proid + ", proname=" + proname + ", empid=" + empid
				+ ", ename=" + ename + ", supid=" + supid + ", supname=" + supname + ", purdate=" + purdate + ", purcount=" + purcount + ", purprice=" + purprice
				+ ", purtotal=" + purtotal + "]";
	}

}

