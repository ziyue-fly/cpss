/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.StorecountDao;
import com.ouc.cpss.vo.ViewStorecount;
import java.util.List;

/**
 *
 * @author su
 */
public class StorecountBizImpl implements StorecountBiz{
    StorecountDao stdao = new StorecountDao();
    @Override
    public List<ViewStorecount> findByCondition(String condition) {
        String sql = "select * from view_storecount";
            if(condition.length() > 0){
                sql += " where concat(proname,type) like '%"+condition+"%'";
            }
	    return stdao.query(sql, ViewStorecount.class);
        
    }
    
}
