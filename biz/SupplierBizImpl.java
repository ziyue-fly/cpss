/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.SupplierDao;
import com.ouc.cpss.po.Supplier;
import java.util.List;

/**
 *
 * @author 晨晨
 */
public class SupplierBizImpl implements SupplierBiz {

    //引入Dao

    SupplierDao sdao = new SupplierDao();

    public boolean add(Supplier s) {
        String sql = "insert into supplier values(?,?,?,?,?)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, s.getSupname(), s.getSuptel(), s.getSupaddr(), 1};
        return sdao.update(sql, params);
    }

    public boolean delete(int supid) {
        //软删除操作
        String sql = "update supplier set state = 0 where supid = ?";
        Object[] params = {supid};
        return sdao.update(sql, params);
    }

    public boolean update(Supplier s) {
        String sql = "update supplier set supname=?,suptel=?,supaddr=? where supid=?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {s.getSupname(), s.getSuptel(), s.getSupaddr(),s.getSupid()};
        return sdao.update(sql, params);
    }

    public Supplier findById(int supid) {
        String sql = "select * from supplier where supid=?";
        Object[] params = {supid};
        return (Supplier) sdao.get(sql, Supplier.class, params);
    }

    public List<Supplier> findAll() {
        String sql = "select * from supplier where state = 1";
        return (List<Supplier>) sdao.query(sql, Supplier.class);
    }

    public List<Supplier> findByCondition(String condition) {
        String sql = "select * from supplier where state = 1";
        if (condition.length() > 0) {
            sql += " and concat(supname,supaddr) like '%" + condition + "%'";
        }
        return sdao.query(sql, Supplier.class);
    }

    @Override
    public Supplier findBySubQuery(int purid) {
        String sql = "select * from supplier where supid = (select supid from purchase where purid = ?)";
        Object[] params = {purid};
        return (Supplier) sdao.get(sql, Supplier.class, params);
    }

}
