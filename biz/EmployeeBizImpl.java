/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.EmployeeDao;
import com.ouc.cpss.po.Employee;
import com.ouc.cpss.vo.ViewEmpsel;
import java.util.List;

/**
 *
 * @author 晨晨
 */
public class EmployeeBizImpl implements EmployeeBiz {

    //引入Dao

    EmployeeDao edao = new EmployeeDao();

    public boolean add(Employee e) {
        String sql = "insert into employee values(?,?,?,?,?,?,?,?,?)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, e.getEname(), e.getEsex(), e.getEage(), e.getEtel(),
            e.getEaddr(), e.getPosition(), 1};
        return edao.update(sql, params);
    }

    public boolean delete(int empid) {
        //软删除操作
        String sql = "update employee set state = 0 where empid = ?";
        Object[] params = {empid};
        return edao.update(sql, params);
    }

    public boolean update(Employee e) {
        String sql = "update employee set ename=?,esex=?,eage=?,etel=?,eaddr=?,position=? where empid=?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {e.getEname(), e.getEsex(), e.getEage(), e.getEtel(),
            e.getEaddr(), e.getPosition(), e.getEmpid()};
        return edao.update(sql, params);
    }

    public Employee findById(int empid) {
        String sql = "select * from employee where empid=?";
        Object[] params = {empid};
        return (Employee) edao.get(sql, Employee.class, params);
    }

    public List<Employee> findAll() {
        String sql = "select * from employee where state = 1";
        return (List<Employee>) edao.query(sql, Employee.class);
    }

    public List<Employee> findByCondition(String condition) {
        String sql = "select * from employee where state = 1";
        if (condition.length() > 0) {
            sql += " and concat(ename,esex,eage,eaddr,position) like '%" + condition + "%'";
        }
        return edao.query(sql, Employee.class);
    }

    @Override
    public Employee findBySubquery(int selid) {
        String sql = "select * from employee where empid = (select empid from sells where selid = ?)";
        Object[] params = {selid};
        return (Employee) edao.get(sql, Employee.class, params);
    }

    @Override
    public List<ViewEmpsel> findByCondition(Integer mon, String conditions) {
        String sql = "select * from view_empsel where mon = ?";
	Object[] params = {mon};
        if (conditions != null && conditions.length() > 0) {
            sql += " and concat(ename) like '%" + conditions + "%'";
         }
        return edao.query(sql, ViewEmpsel.class,params);  
    }

    @Override
    public List<ViewEmpsel> findByCondition(Integer mon) {
        String sql = "select * from view_empsel where mon = ? order by totalprice desc limit 0,10";
	Object[] params = {mon};
        return edao.query(sql, ViewEmpsel.class,params); 
    }
}
