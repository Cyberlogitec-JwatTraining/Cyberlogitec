package vn.com.cyberlogitec.practice;

public class Room1 implements IRoom{
	
	private IAnimal pet;
	
	private String name;
	
	public Room1() {
		// TODO Auto-generated constructor stub
		this.name = "phong 1";
	}
	
	public Room1(IAnimal pet) {
		this.name = "phong 1";
		this.pet = pet;
	}
	
	public String getRoom() {
		return name;
	}
	
	public String getAnimal() {
		return pet.getName();
	}
	
	public void setPet(IAnimal pet) {
		this.pet = pet;
	}
}
