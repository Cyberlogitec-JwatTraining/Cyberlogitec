package vn.com.cyberlogitec.ioc.room;

import vn.com.cyberlogitec.ioc.animal.Animal;

public interface Room {
	/**
	 * Get Animal object
	 * @return Animal
	 */
	Animal getAnimal();
	
	/**
	 * Get room name
	 * @return room's name
	 */
	String getRoom();
}
