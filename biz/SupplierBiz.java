/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.po.Supplier;
import java.util.List;

/**
 *
 * @author 晨晨
 */
public interface SupplierBiz {
    //1.增加供应商信息
    public boolean add(Supplier sup);
    //2.删除供应商信息
    public boolean delete(int supid);
    //3.修改供应商信息
    public boolean update(Supplier sup);
    //4.根据编号查找供应商
    public Supplier findById(int supid);
    //5.查询所有供应商
    public  List<Supplier> findAll();	//返回集合
    //6.模糊查询
    public List<Supplier> findByCondition(String condition);  
    //7.利用子查询查找指定供应商
    public Supplier findBySubQuery(int purid);
}
