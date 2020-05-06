package vn.com.cyberlogitec.config;

public class room1 implements Room{
	private Animal animal;

	public room1(Animal cat) {
		this.animal = cat;
	}

	@Override
	public Animal getAnimal() {
		return animal;
	}

	@Override
	public String getRoom() {
		return "Room 1";
	}
		
}