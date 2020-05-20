package vn.com.cyberlogitec.config;

public class Room3 implements Room {
	private Animal ani;

	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return ani.getName();
	}
	@Override
	public String getRoom() {
		// TODO Auto-generated method stub
		return "Room 3" ;
	}
}