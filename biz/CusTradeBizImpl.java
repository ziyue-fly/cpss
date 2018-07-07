/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.CusTradeDao;
import com.ouc.cpss.vo.ViewCusTrade;
import java.util.List;

/**
 *
 * @author su
 */
public class CusTradeBizImpl implements CusTradeBiz{
    CusTradeDao ctdao = new CusTradeDao();
    public List<ViewCusTrade> findByCondition(String start, String end, String condition){
        
        String sql = "select cusid,cusname,tbid,sum(seltotal) as totalmoney from view_cus_trade where seldate between '"+start+"' and '"+end+"'";
        if(condition != null && condition.length()>0){
            sql +=" and concat(cusname,cusid,tbid) like '%"+condition+"%'";
        }
        sql += " GROUP BY cusid";
        return ctdao.query(sql, ViewCusTrade.class);
    }
}
