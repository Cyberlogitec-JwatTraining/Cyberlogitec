package vn.com.cyberlogitec.practice;

public class Cat implements IAnimal{

	private String name;
	
	public Cat() {
		// TODO Auto-generated constructor stub
		this.name = "Mèo nè";
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
}
