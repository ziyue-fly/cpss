/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.vo.ViewProfit;
import java.util.List;

/**
 *
 * @author su
 */
public interface ProfitBiz {
    public List<ViewProfit> findBySeason(Integer season);
    
    public List<ViewProfit> findAll();
}
