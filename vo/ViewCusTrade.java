/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.vo;

import java.math.BigDecimal;

/**
 * 买家交易金额统计
 * @author su
 */
public class ViewCusTrade {
    private Integer cusid;
	private String cusname;
        private String tbid;
	private BigDecimal totalmoney;
	public ViewCusTrade() {
		super();
	}
	public ViewCusTrade(Integer cusid, String cusname, BigDecimal totalmoney) {
		super();
		this.cusid = cusid;
		this.cusname = cusname;
		this.totalmoney = totalmoney;
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
        public String getTbid() {
		return tbid;
	}
	public void setTbid(String tbid) {
		this.tbid = tbid;
	}
	public BigDecimal getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(BigDecimal totalmoney) {
		this.totalmoney = totalmoney;
	}
	@Override
	public String toString() {
		return "ViewCusTrade [cusid=" + cusid + ", cusname=" + cusname +",tbid=" + tbid + ", totalmoney=" + totalmoney + "]";
	}
	
}
