package com.CLV.entity;

public class Student {
    private Integer stu_id;
    private String stu_name;
    private String branch;
    private Integer percentage;
    private Integer phone;
    private String email;
    public Student() {
		
	}
	public Student(Integer stu_id, String stu_name, String branch, Integer percentage, Integer phone, String email) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.branch = branch;
		this.percentage = percentage;
		this.phone = phone;
		this.email = email;
	}
	public Integer getStu_id() {
		return stu_id;
	}
	public void setStu_id(Integer stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Integer getPercentage() {
		return percentage;
	}
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", branch=" + branch + ", percentage="
				+ percentage + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
