package vn.com.cyberlogitec.practice;

public class Bird implements IAnimal{

	private String name;
	
	public Bird() {
		this.name = "Chim n�";
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
