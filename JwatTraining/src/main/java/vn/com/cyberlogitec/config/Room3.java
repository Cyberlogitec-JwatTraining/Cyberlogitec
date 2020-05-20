package vn.com.cyberlogitec.config;

public class Room3 implements Room{

	private Animal animal;
	
	public Room3(){
	}

	public Room3(Animal animal){
		this.animal = animal;
	}
	
	@Override
	public Animal getAnimal() {
		return this.animal;
	}

	@Override
	public String getRoom() {
		return "This is room 3";
	}
	
}
