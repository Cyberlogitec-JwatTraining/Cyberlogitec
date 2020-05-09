package vn.com.cyberlogitec.ioc.room;

import vn.com.cyberlogitec.ioc.animal.Animal;

public class Room2 implements Room {
	Animal animal;
	
	public void setAnimal(Animal animal) {
		this.animal =animal;
	}

	@Override
	public Animal getAnimal() {
		return animal;
	}

	@Override
	public String getRoom() {
		return "Room 2: ";
	}

}
