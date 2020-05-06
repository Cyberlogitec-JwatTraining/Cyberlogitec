package vn.com.cyberlogitec.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class room3 implements Room{
	@Autowired
	@Qualifier("bird")
	private Animal animal;

	@Override
	public Animal getAnimal() {
		return animal;
	}
	
	@Override
	public String getRoom() {
		return "Room 3";
	}
	
}