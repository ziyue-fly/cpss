/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.po;

/**
 *
 * @author LIUYIYU
 */
import java.math.BigDecimal;

//prtid int primary key auto_increment, -- 采购退货单号
//	proid int not null, -- 外键，商品编号
//	supid int not null, -- 外键，供应商编号
//	prtcount int, -- 退货数量
//	prtprice float, -- 退货单价
//	prttotal float, -- 退货总金额
//	prtdate date -- 退货日期

public class PurReturn {
	private int prtid;
        private int purid;
	private int proid;
	private String proname;
	private int empid;
	private String ename;
	private int supid;
	private String supname;
	private int prtcount;
	private BigDecimal prtprice;
	private BigDecimal prttotal;
	private String prtdate;

	public PurReturn() {
		super();
	}

	public PurReturn(int prtid, int purid, int proid, String proname, int empid, String ename, int supid, String supname,
			int prtcount, BigDecimal prtprice, BigDecimal prttotal, String prtdate) {
		super();
		this.prtid = prtid;
                this.purid = purid;
		this.proid = proid;
		this.proname = proname;
		this.empid = empid;
		this.ename = ename;
		this.supid = supid;
		this.supname = supname;
		this.prtcount = prtcount;
		this.prtprice = prtprice;
		this.prttotal = prttotal;
		this.prtdate = prtdate;
	}

	public int getPrtid() {
		return prtid;
	}

	public void setPrtid(int prtid) {
		this.prtid = prtid;
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

	public int getPrtcount() {
		return prtcount;
	}

	public void setPrtcount(int prtcount) {
		this.prtcount = prtcount;
	}

	public BigDecimal getPrtprice() {
		return prtprice;
	}

	public void setPrtprice(BigDecimal prtprice) {
		this.prtprice = prtprice;
	}

	public BigDecimal getPrttotal() {
		return prttotal;
	}

	public void setPrttotal(BigDecimal prttotal) {
		this.prttotal = prttotal;
	}

	public String getPrtdate() {
		return prtdate;
	}

	public void setPrtdate(String prtdate) {
		this.prtdate = prtdate;
	}

	@Override
	public String toString() {
		return "PurReturn [prtid=" + prtid + ", proid=" + proid + ", proname=" + proname + ", empid=" + empid
				+ ", ename=" + ename + ", supid=" + supid + ", supname=" + supname + ", prtcount=" + prtcount
				+ ", prtprice=" + prtprice + ", prttotal=" + prttotal + ", prtdate=" + prtdate + "]";
	}

}
