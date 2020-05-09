package vn.com.cyberlogitec.beanfactory.context;

public class Student {
	private String name;
	private String location;
	public Student() {
		super();
	}
	public Student(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return this.name + " - " +this.location;
		
	}
}
