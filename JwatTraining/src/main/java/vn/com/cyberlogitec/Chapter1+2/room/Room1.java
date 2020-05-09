package vn.com.cyberlogitec.ioc.room;

import vn.com.cyberlogitec.ioc.animal.Animal;

public class Room1 implements Room{
	Animal animal;
	public Room1(Animal injectedAnimal) {
		this.animal= injectedAnimal;
	}

	@Override
	public Animal getAnimal() {
		return animal;
	}

	@Override
	public String getRoom() {
		return "Room 1: ";
	}
	
}
