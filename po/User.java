/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.po;

/**
 *
 * @author 晨晨
 */
public class User {
        private Integer usid;   //用户编号
	private String usname;	//用户名
	private String pswd;	//密码
	private String realname;	//真实姓名
	private String idnumber;	//身份证号
	private String ustel;	//联系电话
	private String usemail;	//邮箱
	private String position;	//总管理员，销售员，基本资料管理员
	public User() {
		super();
	}
	public User(Integer usid, String usname, String pswd, String realname, String idnumber, String ustel, String usemail, String position) {
		super();
                this.usid = usid;
		this.usname = usname;
		this.pswd = pswd;
		this.realname = realname;
		this.idnumber = idnumber;
		this.ustel = ustel;
		this.usemail = usemail;
		this.position = position;
	}
	public Integer getUsid() {
		return usid;
	}
	public void setUsid(Integer usid) {
		this.usid = usid;
	}
	public String getUsname() {
		return usname;
	}
	public void setUsname(String usname) {
		this.usname = usname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getUstel() {
		return ustel;
	}
	public void setUstel(String ustel) {
		this.ustel = ustel;
	}
	public String getUsemail() {
		return usemail;
	}
	public void setUsemail(String usemail) {
		this.usemail = usemail;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "User [usid=" + usid + ", usname=" + usname + ", pswd=" + pswd + ", realname=" + realname + 
                        ", idnumber=" + idnumber + ", ustel=" + ustel + ", usemail=" + usemail + ", position=" + position + "]";
	}   
}
