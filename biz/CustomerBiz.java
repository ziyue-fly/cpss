/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.po.Customer;
import java.util.List;

/**
 *
 * @author 晨晨
 */
public interface CustomerBiz {
    //1.增加客户信息
    public boolean add(Customer cus);
    //2.删除客户信息
    public boolean delete(int cusid);
    //3.修改客户信息
    public boolean update(Customer cus);
    //4.根据编号查找客户
    public Customer findById(int cusid);
    //5.查询所有客户
    public  List<Customer> findAll();	//返回集合
    //6.模糊查询
    public List<Customer> findByCondition(String condition);    
    //7.子查询由销售单号找客户对象
    public Customer findBySubquery(int selid);
}
