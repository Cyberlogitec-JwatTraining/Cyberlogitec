package com.cyberlogitec.jwat.springmybatis.model;

public class User {
	private int id;
	private String name;
	private int sex;
	private String account;
	private String password;
	private int userLevel;
	
	public User(int id, String name, int sex, String account, String password, int userLevel) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.account = account;
		this.password = password;
		this.userLevel = userLevel;
	}
	
	public User() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", account=" + account + ", password=" + password
				+ ", userLevel=" + userLevel + "]";
	}
}
