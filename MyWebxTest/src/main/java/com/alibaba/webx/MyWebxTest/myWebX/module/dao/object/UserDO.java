package com.alibaba.webx.MyWebxTest.myWebX.module.dao.object;

/**
 * 用户VO
 * @author zkn
 *
 */

public class UserDO {

	/**
	 * 姓名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
