package vn.com.cyberlogitec.config;

public class Room1 implements Room{
	
	private Animal animal;
	
	public Room1(){
	}

	public Room1(Animal animal){
		this.animal = animal;
	}
	
	@Override
	public Animal getAnimal() {
		return this.animal;
	}

	@Override
	public String getRoom() {
		return "This is room 1";
	}

}
