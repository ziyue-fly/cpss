/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.po.Sells;
import com.ouc.cpss.vo.ViewSell;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface SellsBiz {
     // 1 增加销售信息
	public boolean add(Sells s);

	// 2 删除销售信息
	public boolean delete(int selid);

	// 3 修改销售信息
	public boolean update(Sells s);

	// 4 根据编号查找销售信息
	public Sells findByID(int selid);

	// 5 查询所有销售信息
	public List<Sells> findAll();

	// 6 模糊查询销售信息
	public List<ViewSell> findByCondition(String start, String end, String conditions);
        
        // 7 销售出库
        public boolean sellOut(Object[][] sells,Object[][] stocks);
        
        
        // 8 销售退货
        public boolean sellsReturn(int selid, int proid, int cusid, int srtcount, BigDecimal srtprice, BigDecimal srttotal, Date srtdate);
       
    
}
