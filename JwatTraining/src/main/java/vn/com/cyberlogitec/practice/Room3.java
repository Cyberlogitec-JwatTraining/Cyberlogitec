package vn.com.cyberlogitec.practice;

import org.springframework.stereotype.Component;

@Component(value="Room3")
public class Room3 implements IRoom{

private IAnimal pet;
	
	private String name;
	
	public Room3() {
		// TODO Auto-generated constructor stub
		this.name = "phong 3";
	}
	
	public Room3(IAnimal pet) {
		this.name = "phong 3";
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
