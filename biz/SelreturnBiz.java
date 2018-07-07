 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;



import com.ouc.cpss.po.Selreturn;
import com.ouc.cpss.vo.ViewSelReturn;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface SelreturnBiz {
       // 1 增加销售退货信息
	public boolean add(Selreturn s);

	// 2 删除销售退货信息
	public boolean delete(int srtid);

	// 3 修改销售退货信息
	public boolean update(Selreturn s);

	// 4 根据编号查找销售退货信息
	public Selreturn findByID(int srtid);

	// 5 查询所有销售退货信息
	public List<Selreturn> findAll();

	// 6 模糊查询销售退货信息
	public List<ViewSelReturn> findByCondition(String start, String end, String condition);
    
}
