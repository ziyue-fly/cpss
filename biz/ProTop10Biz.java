/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.vo.ViewPro;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface ProTop10Biz {
    public List<ViewPro> findByCondition(String start, String end, String conditions);
}
