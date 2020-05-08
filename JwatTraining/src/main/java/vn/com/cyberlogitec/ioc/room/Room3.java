package vn.com.cyberlogitec.ioc.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import vn.com.cyberlogitec.ioc.animal.Animal;

public class Room3 implements Room{
	@Autowired
	@Qualifier("dog")
	private Animal animal;

	@Override
	public Animal getAnimal() {
		return animal;
	}

	@Override
	public String getRoom() {
		return "Room 3: ";
	}

}
