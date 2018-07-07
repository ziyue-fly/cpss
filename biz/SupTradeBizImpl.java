/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.SupTradeDao;
import com.ouc.cpss.vo.ViewSupTrade;
import java.util.List;

/**
 *
 * @author su
 */
public class SupTradeBizImpl implements SupTradeBiz{

    SupTradeDao stdao = new SupTradeDao();
    @Override
    public List<ViewSupTrade> findByCondition(String start, String end, String condition) {
         String sql = "select supname,proname,sum(purcount) as totalcount,sum(purcount*purprice) as "
                    + " purtotal from view_purchase where purdate between '"+start+"' and '"+end+"'";
        if(condition != null && condition.length()>0){
            sql +=" and concat(proname,supname) like '%"+condition+"%'";
        }
        sql += " GROUP BY supname,proname";
        return stdao.query(sql, ViewSupTrade.class);
    }

    @Override
    public List<ViewSupTrade> findByConditionForChart(String start, String end, String condition) {
        String sql = "select supname,proname,sum(purcount) as totalcount,sum(purcount*purprice) as "
                    + " purtotal from view_purchase where purdate between '"+start+"' and '"+end+"'";
        if(condition != null && condition.length()>0){
            sql +=" and concat(proname,supname) like '%"+condition+"%'";
        }
        sql += " GROUP BY supname";
        return stdao.query(sql, ViewSupTrade.class);
    }
    
}
