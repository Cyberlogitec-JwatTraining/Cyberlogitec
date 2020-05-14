package vn.com.cyberlogitec.DemoAnnotation.model;

public class Student {

	private int id;
	private String name;
	private String sex;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setLocation(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "ID: "+ this.id +". Name: " + this.name + ". Gender: " + this.sex;
	}
}
