/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.po;

import java.math.BigDecimal;

/**
 * 商品类
 * @author 晨晨
 */
public class Product {
        private Integer proid;
	private String proname;
	private String type;
        private String color;
        private Integer safecount;
	private Integer nowcount;
	private BigDecimal sugpurchase;
	private BigDecimal sugsell;
	public Product() {
		super();
	}
	public Product(Integer proid, String proname, String type, String color, Integer safecount, Integer nowcount, 
                BigDecimal sugpurchase, BigDecimal sugsell) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.type = type;
                this.color = color;
		this.safecount = safecount;
                this.nowcount = nowcount;
		this.sugpurchase = sugpurchase;
		this.sugsell = sugsell;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
	public Integer getSafecount() {
		return safecount;
	}
	public void setSafecount(Integer safecount) {
		this.safecount = safecount;
	}
        public Integer getNowcount() {
		return nowcount;
	}
	public void setNowcount(Integer nowcount) {
		this.nowcount = nowcount;
	}
	public BigDecimal getSugpurchase() {
		return sugpurchase;
	}
	public void setSugpurchase(BigDecimal sugpurchase) {
		this.sugpurchase = sugpurchase;
	}
	public BigDecimal getSugsell() {
		return sugsell;
	}
	public void setSugsell(BigDecimal sugsell) {
		this.sugsell = sugsell;
	}
	@Override
	public String toString() {
		return "商品编号：" + proid + ", 商品名称：" + proname + ", 商品型号：" + type + "商品颜色："+ color +
                        ", 安全库存：" + safecount + "当前库存："+ nowcount + ", 商品建议采购价：" + sugpurchase + 
                        ", 商品建议零售价：" + sugsell ;
	}   
}
