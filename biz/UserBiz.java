/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.po.User;
import java.util.List;

/**
 *
 * @author 晨晨
 */
public interface UserBiz{
    //1.增加用户信息
    public boolean add(User u);
    //2.修改用户密码
    public boolean update(User u);
    //3.查询用户名是否已经存在
    public User findByUsname(String usname);	//返回集合
    //4.登录
   // public User userlogin(String usname,String pswd);

}
