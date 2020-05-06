package vn.com.cyberlogitec.exercise1;

import org.springframework.beans.factory.annotation.Autowired;

public class Room3 implements Room{
	@Autowired
	private Cat cat;
	
	public String getRoom() {
		return "3";
	}
	public Cat getAnimal() {
		return cat;
	}
}
