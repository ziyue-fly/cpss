/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.po.Employee;
import com.ouc.cpss.vo.ViewEmpsel;
import java.util.List;

/**
 *
 * @author 晨晨
 */
public interface EmployeeBiz {
    //1.增加员工信息
    public boolean add(Employee emp);
    //2.删除员工信息
    public boolean delete(int enpid);
    //3.修改员工信息
    public boolean update(Employee emp);
    //4.根据编号查找员工
    public Employee findById(int empid);
    //5.查询所有员工
    public  List<Employee> findAll();	//返回集合
    //6.模糊查询
    public List<Employee> findByCondition(String condition);   
    
    //7.子查询从view_sell表里找到对用的销售员工
    public Employee findBySubquery(int selid);
    
    //8.统计每月销售员销售信息
    public List<ViewEmpsel> findByCondition(Integer mon, String conditions) ;
    
    //9.统计每月销售员销售信息生成Top10图表
    public List<ViewEmpsel> findByCondition(Integer mon) ;
}
