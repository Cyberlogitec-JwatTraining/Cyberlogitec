package vn.com.cyberlogitec.practice_test2.ex2;

import org.springframework.stereotype.Component;

@Component("Student_ex2")
public class Student {
	private String id;
	private String name;
	public Student() {
		this.id = "null";
		this.name = "null";
	}
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void printJobWhenDone() {
		System.out.println("Created Student !");
	}

}
