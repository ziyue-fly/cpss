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
public class Employee {
	private Integer empid;
	private String ename;
	private String esex;
	private Integer eage;
	private String etel;
	private String eaddr;
	private String position;	//老板、销售员、采购员
	//private int choose;	//0对应老板，1对应销售员，2对应采购员
	public Employee() {
		super();
	}
	public Employee(Integer empid, String ename, String esex, Integer eage, String etel, String eaddr, String position) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.esex = esex;
		this.eage = eage;
		this.etel = etel;
		this.eaddr = eaddr;
		this.position = position;
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
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	public Integer getEage() {
		return eage;
	}
	public void setEage(Integer eage) {
		this.eage = eage;
	}
	public String getEtel() {
		return etel;
	}
	public void setEtel(String etel) {
		this.etel = etel;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
        
	@Override
	public String toString() {
		return ename;
	}    
}
