/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.PurreturnDao;
import com.ouc.cpss.vo.ViewPurReturn;
import java.util.List;

/**
 *
 * @author LIUYIYU
 */
public class PurReturnBizImpl implements PurReturnBiz{
    PurreturnDao pdao = new PurreturnDao();
    
    @Override
    public List<ViewPurReturn> findByCondition(String start, String end, String condition) {
        String sql = "select * from view_purreturn where prtdate between '" + start + "' and '" + end + "'";
        if (condition != null && condition.length() > 0) {
            sql += " and concat(proname,type, supname) like '%" + condition + "%'";
        }
	return (List<ViewPurReturn>) pdao.query(sql,ViewPurReturn.class);      
    }
}
