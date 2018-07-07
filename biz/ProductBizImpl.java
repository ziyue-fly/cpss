/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.ProductDao;
import com.ouc.cpss.po.Product;
import java.util.List;

/**
 *
 * @author 晨晨
 */
public class ProductBizImpl implements ProductBiz {
	//引入Dao
	ProductDao pdao = new ProductDao();
	public boolean add(Product p) {
		String sql = "insert into product values(?,?,?,?,?,?,?,?,?)";
		//params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
		Object[] params = {null,p.getProname(),p.getType(),p.getColor(),
				p.getSafecount(),p.getNowcount(),p.getSugpurchase(),p.getSugsell(),1};
		return pdao.update(sql, params);
	}

	public boolean delete(int proid) {
            //软删除操作
            String sql = "update product set state = 0 where proid = ?";
            Object[] params = {proid};
            return pdao.update(sql, params);
	}

	public boolean update(Product p) {
		String sql = "update product set proname=?,type=?,color=?,safecount=?,nowcount=?,sugpurchase=?,sugsell=? where proid=?";
		//params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
		Object[] params = {p.getProname(),p.getType(),p.getColor(),p.getSafecount(),p.getNowcount(),
				p.getSugpurchase(),p.getSugsell(),p.getProid()};
		return pdao.update(sql, params);
	}

	public Product findById(int proid) {
		String sql = "select * from product where proid=?";
		Object[] params = {proid};
		return (Product) pdao.get(sql, Product.class, params);
	}

	public List<Product> findAll() {
		String sql = "select * from product where state = 1";
		return (List<Product>) pdao.query(sql, Product.class);
	}

	public List<Product> findByCondition(String condition) {
            String sql = "select * from product where state = 1";
            if(condition !=null && condition.length() > 0){
                sql += " and concat(proname,type,color) like '%"+condition+"%'";
            }
	    return pdao.query(sql, Product.class);
	}    

    @Override
    public Product findBySubquery(int selid) {
        String sql = "select * from product where proid = (select proid from sells where selid = ?)";
        Object[] params = {selid};
        return (Product) pdao.get(sql, Product.class, params);
    }
}
