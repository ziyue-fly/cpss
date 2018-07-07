package com.ouc.cpss.biz;

import com.ouc.cpss.dao.CustomerDao;
import com.ouc.cpss.po.Customer;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 晨晨
 */
public class CustomerBizImpl implements CustomerBiz {

    //引入Dao

    CustomerDao cdao = new CustomerDao();

    public boolean add(Customer c) {
        String sql = "insert into customer values(?,?,?,?,?,?,?)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, c.getCusname(), c.getTbid(), c.getCustel(),
            c.getCusemail(), c.getCusaddr(), 1};
        return cdao.update(sql, params);
    }

    public boolean delete(int cusid) {
        //软删除操作
        String sql = "update customer set state = 0 where cusid = ?";
        Object[] params = {cusid};
        return cdao.update(sql, params);
    }

    public boolean update(Customer c) {
        String sql = "update customer set cusname=?,tbid=?,custel=?,cusemail=?,cusaddr=? where cusid=?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {c.getCusname(), c.getTbid(), c.getCustel(),
            c.getCusemail(), c.getCusaddr(),c.getCusid()};
        return cdao.update(sql, params);
    }

    public Customer findById(int cusid) {
        String sql = "select * from customer where cusid=?";
        Object[] params = {cusid};
        return (Customer) cdao.get(sql, Customer.class, params);
    }

    public List<Customer> findAll() {
        String sql = "select * from customer where state = 1";
        return (List<Customer>) cdao.query(sql, Customer.class);
    }

    public List<Customer> findByCondition(String condition) {
        String sql = "select * from customer where state = 1";
        if (condition.length() > 0) {
            sql += " and concat(cusname,tbid,cusemail,cusaddr) like '%" + condition + "%'";
        }
        return cdao.query(sql, Customer.class);
    }

    @Override
    public Customer findBySubquery(int selid) {
        String sql = "select * from customer where cusid = (select cusid from sells where selid = ?)";
        Object[] params = {selid};
        return (Customer) cdao.get(sql, Customer.class, params);
    }
}
