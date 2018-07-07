/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;


import com.ouc.cpss.dao.BaseDao;
import com.ouc.cpss.dao.SellsDao;
import com.ouc.cpss.po.Sells;
import com.ouc.cpss.vo.ViewSell;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author LIUYIYU
 */
public class SellsBizImpl implements SellsBiz{
    //引入Dao
	SellsDao sdao = new SellsDao();
    @Override
    public boolean add(Sells s) {
        String sql = "insert into sells values(?,?,?,?,?,?,?,?)";
        //params中的参数是按顺序逐个给？赋值，所以要注意数据表顺序
	Object[] params = {s.getSelid(),s.getProid(),s.getEmpid(),
                s.getCusid(),s.getSeldate(),s.getSelcount(),s.getSelprice(),s.getSeltotal()};
	return sdao.update(sql, params);
    }

    @Override
    public boolean delete(int selid) {
        // 软删除操作
            String sql = "update sells set state = 0 where proid = ?";
            //params中的参数是按顺序逐个给？赋值，所以要注意数据表顺序
            Object[] params = {selid};
            return sdao.update(sql, params);
    }

    @Override
    public boolean update(Sells s) {
       String sql = "update sells set ,proid=? , empid=? ,cusid=?,  seldate=?,"
               + " selcount=?, selprice=?, seltotal=?  where selid = ?";
	//params中的参数是按顺序逐个给？赋值，所以要注意数据表顺序
		Object[] params = {s.getProid(),s.getEmpid(), s.getCusid(),
                    s.getSeldate(),s.getSelcount(),s.getSelprice(),s.getSeltotal(),s.getSelid()};
		return sdao.update(sql, params);
    }

    @Override
    public Sells findByID(int selid) {
        String sql = "select * from sells where proid = ?";
		Object[] params = {selid};
		return (Sells) sdao.get(sql, Sells.class,params);
    }

    @Override
    public List<Sells> findAll() {
        String sql = "select * from sells where state = 1";
                
		return (List<Sells>) sdao.query(sql, Sells.class);
    }

    public List<Sells> findByCondition(String condition) {
         String sql = "select * from sells where state = 1";
                if(condition.length()>0){
                    sql += " and concat() like '%" + condition + "%'";
                }
		return (List<Sells>) sdao.query(sql,Sells.class);  
    }

    @Override
    public boolean sellsReturn(int selid, int proid, int cusid, int srtcount, BigDecimal srtprice, BigDecimal srttotal, Date srtdate) {
        boolean result = true;
        //修改采购表的退货数量和退货时间
        String sql1 = "insert into selreturn values(null,?,?,?,?,?,?)";
        Object[] params1 = {proid, cusid, srtcount, srtprice, srttotal, srtdate};
        String sql2 = "update product set nowcount = nowcount+? where proid=?";
        Object[] params2 = {srtcount, proid};
        String sql3 = "update sells set selcount = selcount-? where selid = ?";
        Object[] params3 = {srtcount,selid};
        Connection conn = new BaseDao().getConnection();
        try {
            conn.setAutoCommit(false);//启动事务  
            sdao.update(conn, sql1, params1);
            sdao.update(conn, sql2, params2);
            
            sdao.update(conn, sql3, params3);
            
            conn.commit();
        } catch (Exception e) {
            try {
                result = false;
                conn.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
    
    @Override
    public boolean sellOut(Object[][] sells, Object[][] stocks) {
        boolean result = true;
        String sql1 = "insert into sells(selid,proid,empid,cusid,seldate,selcount,selprice,state) values(?,?,?,?,?,?,?,1)";
        String sql2 = "update product set nowcount=nowcount-? where proid=?";//库存增加
        Connection conn = new BaseDao().getConnection();//获得连接
        
        try {
             conn.setAutoCommit(false);//***设置不自动提交
             
             sdao.batchUpdate(conn, sql1, sells);//批量添加采购表
             sdao.batchUpdate(conn, sql2, stocks);//更新商品库存
             
             conn.commit();     //***提交事务,涉及到多个表，要一起提交
        } catch (Exception e) {
           try {
               result = false;
               conn.rollback(); //回滚事务
           } catch (SQLException ex) {
              ex.printStackTrace();
           }
            e.printStackTrace();
        }
       return result;
    }

    @Override
    public List<ViewSell> findByCondition(String start, String end, String conditions) {
       String sql = "select * from view_sell where seldate between '" + start + "' and '" + end + "'";
        if (conditions != null && conditions.length() > 0) {
            sql += " and concat(proname,type,ename,cusname) like '%" + conditions + "%'";
        }
        return sdao.query(sql, ViewSell.class);
   
    }


    
}
