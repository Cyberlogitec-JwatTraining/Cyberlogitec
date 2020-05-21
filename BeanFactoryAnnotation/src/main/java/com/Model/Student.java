package com.Model;

public class Student {
	public String name;
	public String phone;
	public String address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
}
