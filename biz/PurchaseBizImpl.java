/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.BaseDao;
import com.ouc.cpss.dao.ProductDao;
import com.ouc.cpss.dao.PurchaseDao;
import com.ouc.cpss.po.Purchase;
import com.ouc.cpss.vo.ViewPurchase;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author LIUYIYU
 */
public class PurchaseBizImpl implements PurchaseBiz {

    //引入Dao
    ProductDao prodao = new ProductDao();
    PurchaseDao purdao = new PurchaseDao();

    @Override
    public boolean add(Purchase p) {
        String sql = "insert into purchase values(?,?,?,?,?,?,?,?,?)";
        //params中的参数是按顺序逐个给？赋值，因此需要注意数据表顺序
        Object[] params = {null, p.getProid(), p.getEmpid(), p.getSupid(),
            p.getPurdate(), p.getPurcount(), p.getPurprice(), p.getPurtotal(), 1};
        return purdao.update(sql, params);
    }

    @Override
    public boolean delete(int purid) {
        String sql = "update purchase set state = 0 where purid = ?";
        Object[] params = {purid};
        return purdao.update(sql, params);
    }

    @Override
    public boolean update(Purchase p) {
        String sql = "update purchase set proid=?, empid=?, supid=?,  purdate=?, purcount=?, purprice=?, purtotal=?  where purid = ?";
        //params中的参数是按顺序逐个给？赋值，所以要注意数据表顺序
        Object[] params = {p.getProid(), p.getEmpid(), p.getSupid(),
            p.getPurdate(), p.getPurcount(), p.getPurprice(), p.getPurtotal(), p.getPurid()};
        return purdao.update(sql, params);
    }

    @Override
    public Purchase findByID(int purid) {
        String sql = "select * from purchase where purid=?";
        Object[] params = {purid};
        return (Purchase) purdao.get(sql, Purchase.class, params);
    }

    @Override
    public List<Purchase> findAll() {
        String sql = "select * from purchase where state = 1";
        return (List<Purchase>) purdao.query(sql, Purchase.class);
    }

    @Override
    public boolean findPurchase(String proname, String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean purchasein(Object[][] purchases, Object[][] stocks) {
        boolean result = true;
        String sql1 = "insert into purchase(purid,proid,supid,purdate,purcount,purprice,state) values(?,?,?,?,?,?,1)";
        String sql2 = "update product set nowcount=nowcount+? where proid=?";//库存增加
        Connection conn = new BaseDao().getConnection();//获得连接

        try {
            conn.setAutoCommit(false);//***设置不自动提交

            purdao.batchUpdate(conn, sql1, purchases);//批量添加采购表
            prodao.batchUpdate(conn, sql2, stocks);//更新商品库存

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
    public List<ViewPurchase> findByCondition(String start, String end, String conditions) {
        String sql = "select * from view_purchase where purdate between '" + start + "' and '" + end + "'";
        if (conditions != null && conditions.length() > 0) {
            sql += " and concat(proname,type,supname) like '%" + conditions + "%'";
        }
        return purdao.query(sql, ViewPurchase.class);
    }

    @Override
    public boolean purchasereturn(int proid, int purid, int supid, int prtcount, BigDecimal prtprice, Date prtdate) {
        boolean result = true;
        //修改采购表的退货数量和退货时间
        String sql1 = "insert into purreturn values(null,?,?,?,?,?,?)";
        Object[] params1 = {purid, proid, supid, prtcount, prtprice, prtdate};
        String sql2 = "update product set nowcount = nowcount-? where proid=?";
        Object[] params2 = {prtcount, proid};
        String sql3 = "update purchase set purcount = purcount-? where purid = ?";
        Object[] params3 = {prtcount,purid};
        Connection conn = new BaseDao().getConnection();
        try {
            conn.setAutoCommit(false);//启动事务
            
            purdao.update(conn, sql1, params1);
            prodao.update(conn, sql2, params2);
            
            purdao.update(conn, sql3, params3);
            
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

}

