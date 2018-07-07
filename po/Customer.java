/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.po;

/**
 *
 * @author 晨晨
 */
public class Customer {
	private Integer cusid;	//客户编号
	private String cusname;	//客户姓名
	private String tbid;	//淘宝昵称
	private String custel;	//联系电话
	private String cusemail;	//邮箱
	private String cusaddr;		//客户住址
	public Customer() {
		super();
	}
	public Customer(Integer cusid, String cusname, String tbid, String custel, String cusemail, String cusaddr) {
		super();
		this.cusid = cusid;
		this.cusname = cusname;
		this.tbid = tbid;
		this.custel = custel;
		this.cusemail = cusemail;
		this.cusaddr = cusaddr;
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
	public String getCustel() {
		return custel;
	}
	public void setCustel(String custel) {
		this.custel = custel;
	}
	public String getCusemail() {
		return cusemail;
	}
	public void setCusemail(String cusemail) {
		this.cusemail = cusemail;
	}
	public String getCusaddr() {
		return cusaddr;
	}
	public void setCusaddr(String cusaddr) {
		this.cusaddr = cusaddr;
	}
	@Override
	public String toString() {
		return cusname;
	}    
        
}
