package vn.com.cyberlogitec.practice;

public class Dog implements IAnimal{

	private String name;
	
	public Dog() {
		// TODO Auto-generated constructor stub
		this.name = "Ch� n�";
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
