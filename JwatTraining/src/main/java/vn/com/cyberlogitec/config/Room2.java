package vn.com.cyberlogitec.config;

public class Room2 implements Room{

	private Animal animal;
	
	public Room2(){
	}

	public Room2(Animal animal){
		this.animal = animal;
	}
	
	@Override
	public Animal getAnimal() {
		return this.animal;
	}

	@Override
	public String getRoom() {
		return "This is room 2";
	}

}
