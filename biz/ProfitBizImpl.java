/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.ProfitDao;
import com.ouc.cpss.vo.ViewProfit;
import java.util.List;

/**
 *
 * @author su
 */
public class ProfitBizImpl implements ProfitBiz{
    ProfitDao pfdao = new ProfitDao();
    public List<ViewProfit> findBySeason(Integer season){
        String startmonth = "1";
        String endmonth = "12";
        switch(season){
            case 1:startmonth = "1";endmonth = "3";break;
            case 2:startmonth = "4";endmonth = "6";break;
            case 3:startmonth = "7";endmonth = "9";break;
            case 4:startmonth = "10";endmonth = "12";break;
        }
        String sql = "select * from view_profit where themonth BETWEEN " + startmonth + " and "+endmonth;
        return pfdao.query(sql, ViewProfit.class);
    }

    @Override
    public List<ViewProfit> findAll() {
        String sql = "select * from view_profit";
        return pfdao.query(sql, ViewProfit.class);
    }
}
