package vn.com.cyberlogitec.IocDI.room;

import vn.com.cyberlogitec.IocDI.animal.Animal;

public class Room3 implements Room{
	
	private Animal animal;
	
	public Room3() {};
	
	public Room3(Animal animal) {
		this.animal = animal;
	}
	
	
	@Override
	public Animal getAnimal() {
		return animal;
	}
	
	@Override
	public String getRoom() {
		return "room3";
	}
}
