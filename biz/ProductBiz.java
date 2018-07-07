/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.po.Product;
import java.util.List;

/**
 *
 * @author 晨晨
 */
public interface ProductBiz {
    //1.增加商品
    public boolean add(Product pro);
    //2.删除商品
    public boolean delete(int proid);
    //3.修改商品
    public boolean update(Product pro);
    //4.根据编号查找商品
    public Product findById(int proid);
    //5.查询所有商品
    public  List<Product> findAll();	//返回集合
    //6.模糊查询
    public List<Product> findByCondition(String condition);    
    
    //7.子查询从view_sell表里的proname找到对应的proid
    public Product findBySubquery(int selid);
}
