/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.vo.ViewPurReturn;
import java.util.List;

/**
 *
 * @author LIUYIYU
 */
public interface PurReturnBiz {
    public List<ViewPurReturn> findByCondition(String start, String end, String condition);
}
