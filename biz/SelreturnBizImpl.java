/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;


import com.ouc.cpss.dao.SelreturnDao;
import com.ouc.cpss.po.Selreturn;
import com.ouc.cpss.vo.ViewSelReturn;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class SelreturnBizImpl implements SelreturnBiz{
 //引入Dao
	SelreturnDao sdao = new SelreturnDao();
    @Override
    public boolean add(Selreturn s) {
        String sql = "insert into selreturn values(?,?,?,?,?,?,?,?,?)";
        //params中的参数是按顺序逐个给？赋值，所以要注意数据表顺序
	Object[] params = {s.getSrtid(),s.getSelid(),s.getProid(), s.getEmpid(),
                    s.getCusid(),s.getSrtdate(),s.getSrtcount(),s.getSrtprice(),s.getSrttotal()};
	return sdao.update(sql, params);
    }

    @Override
    public boolean delete(int srtid) {
        // 软删除操作
            String sql = "update selreturn set state = 0 where srtid = ?";
            //params中的参数是按顺序逐个给？赋值，所以要注意数据表顺序
            Object[] params = {srtid};
            return sdao.update(sql, params);
    }

    @Override
    public boolean update(Selreturn s) {
        String sql = "update selreturn set selid=?, proid=?,"
		+ " empid=?, cusid=?,  srtdate=?, srtcount=?, srtprice=?, srttotal=?  where srtid = ?";
	//params中的参数是按顺序逐个给？赋值，所以要注意数据表顺序
		Object[] params = {s.getSelid(),s.getProid(), s.getEmpid(),
                    s.getCusid(),s.getSrtdate(),s.getSrtcount(),s.getSrtprice(),s.getSrttotal(),s.getSrtid()};
		return sdao.update(sql, params);
    }

    @Override
    public Selreturn findByID(int srtid) {
        String sql = "select * from selreturn where srtid = ?";
		Object[] params = {srtid};
		return (Selreturn) sdao.get(sql, Selreturn.class,params);
    }

    @Override
    public List<Selreturn> findAll() {
         String sql = "select * from selreturn where state = 1";
         return (List<Selreturn>) sdao.query(sql, Selreturn.class);
    }

    @Override
    public List<ViewSelReturn> findByCondition(String start, String end, String condition) {
        String sql = "select * from view_selreturn where srtdate between '" + start + "' and '" + end + "'";
        if (condition != null && condition.length() > 0) {
            sql += " and concat(proname,type, cusname) like '%" + condition + "%'";
        }
	return (List<ViewSelReturn>) sdao.query(sql,ViewSelReturn.class);      
    }
    
}
