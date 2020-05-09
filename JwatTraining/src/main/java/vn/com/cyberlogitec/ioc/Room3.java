package vn.com.cyberlogitec.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Room3 implements Room {
	@Autowired
	private Animal ani;
	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return ani.getname();
	}

	@Override
	public String getRoom() {
		// TODO Auto-generated method stub
		return "Room 3";
	}

}
