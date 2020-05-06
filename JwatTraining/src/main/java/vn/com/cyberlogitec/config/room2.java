package vn.com.cyberlogitec.config;

public class room2 implements Room{
	private Animal animal;
	
	@Override
	public Animal getAnimal() {
		return animal;
	}
	
	@Override
	public String getRoom() {
		return "Room 2";
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}