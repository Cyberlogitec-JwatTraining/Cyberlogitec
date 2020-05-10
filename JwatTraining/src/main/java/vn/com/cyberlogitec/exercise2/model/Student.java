package vn.com.cyberlogitec.exercise2.model;

public class Student {
	private int id = 0;
	private String name = "Default username";

	public Student() {
		super();
		this.id = 1;
		this.name = "Default username constructor";
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "model: " + this.id + " : " + this.name;
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
}
