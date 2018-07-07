/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

/**
 *
 * @author LIUYIYU
 */
import java.util.List;

import com.ouc.cpss.po.Purchase;
import com.ouc.cpss.vo.ViewPurchase;
import java.math.BigDecimal;
import java.sql.Date;

public interface PurchaseBiz {

    // 1增加新的采购信息
    public boolean add(Purchase p);

    // 删除一条采购信息
    public boolean delete(int purid);

    // 3修改采购信息
    public boolean update(Purchase p);

    // 4根据编号查找采购信息
    public Purchase findByID(int purid);

    // 5查询所有
    public List<Purchase> findAll();

    // 6模糊查询

    public List<ViewPurchase> findByCondition(String start, String end, String conditions);

    public boolean findPurchase(String proname, String type);

    //采购入库
    public boolean purchasein(Object[][] purchases, Object[][] stocks);


    //采购退货（单个商品退货）
    public boolean purchasereturn(int purid, int proid, int supid, int prtcount, BigDecimal prtprice,Date prtdate);

}
