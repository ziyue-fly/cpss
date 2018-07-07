/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.vo.ViewStorecount;
import java.util.List;

/**
 *
 * @author su
 */
public interface StorecountBiz {
    //查找商品库存信息
    public List<ViewStorecount> findByCondition (String condition);
}
