package vn.com.cyberlogitec.IocDI.room;

import vn.com.cyberlogitec.IocDI.animal.Animal;

public class Room1 implements Room{
	
	private Animal animal;
	
	public Room1() {}
	
	public Room1(Animal animal) {
		this.animal = animal;
	}
	
	
	@Override
	public Animal getAnimal() {
		return animal;
	}
	
	@Override
	public String getRoom() {
		return "room1";
	}
}
