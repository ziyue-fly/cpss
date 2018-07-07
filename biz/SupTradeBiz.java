/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.vo.ViewSupTrade;
import java.util.List;

/**
 *
 * @author su
 */
public interface SupTradeBiz {
    public List<ViewSupTrade> findByCondition(String start, String end, String conditions);
    
    // 直接用数据表生成图表会出现bug，比如同一供应商供应了不同的商品，在图表中就会被分成多份
    // 改写只要把group by语句改为group by supname即可
    public List<ViewSupTrade> findByConditionForChart(String start, String end, String condition);
}
