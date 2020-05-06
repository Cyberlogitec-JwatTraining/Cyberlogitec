package vn.com.cyberlogitec.practice;

public class Room2 implements IRoom{

private IAnimal pet;
	
	private String name;
	
	public Room2() {
		// TODO Auto-generated constructor stub
		this.name = "phong 2";
	}
	
	public Room2(IAnimal pet) {
		this.name = "phong 2";
		this.pet = pet;
	}
	
	@Override
	public String getRoom() {
		return name;
	}
	
	@Override
	public String getAnimal() {
		return pet.getName();
	}
	
	public void setPet(IAnimal pet) {
		this.pet = pet;
	}
}
