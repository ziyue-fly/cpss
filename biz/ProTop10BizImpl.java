/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.ProductDao;
import com.ouc.cpss.vo.ViewPro;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ProTop10BizImpl implements ProTop10Biz{
    ProductDao pdao = new ProductDao();
    @Override
    public List<ViewPro> findByCondition(String start, String end, String conditions) {
        String sql = "select p.proid,p.proname,p.type,"
                + " totalpurcount,totalpurmoney,totalselcount,totalselmoney"
                + " from product p,view_pursum v1,view_sellsum v2 "
                + " where p.proid = v1.proid" 
                + " and p.proid = v2.proid"
                + " and seldate between ? and ? ";
	Object[] params = {start,end};
        if (conditions != null && conditions.length() > 0) {
            sql += " and concat(proname,type) like '%" + conditions + "%'";
         }
        sql += " group by p.proid;";
        return pdao.query(sql, ViewPro.class,params);
    }
    
}
