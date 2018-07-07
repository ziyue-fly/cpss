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
public class Supplier {
    	private Integer supid;	//供应商编号
	private String supname;	// 名称
	private String suptel;   //供应商电话
	private String supaddr;  //供应商地址
	public Supplier() {
		super();
	}
	public Supplier(Integer supid, String supname, String suptel, String supaddr) {
		super();
		this.supid = supid;
		this.supname = supname;
		this.suptel = suptel;
		this.supaddr = supaddr;
	}
	public Integer getSupid() {
		return supid;
	}
	public void setSupid(Integer supid) {
		this.supid = supid;
	}
	public String getSupname() {
		return supname;
	}
	public void setSupname(String supname) {
		this.supname = supname;
	}
	public String getSuptel() {
		return suptel;
	}
	public void setSuptel(String suptel) {
		this.suptel = suptel;
	}
	public String getSupaddr() {
		return supaddr;
	}
	public void setSupaddr(String supaddr) {
		this.supaddr = supaddr;
	}

	
	//public String toString() {
	//	return "供应商编号：" + supid + ", 供应商名称：" + supname + ", 供应商编号：" 
	//			+ suptel + ", 供应商地址：" + supaddr ;
	//}
        @Override
	public String toString() {
		return supname;
	}
        
        
}
