package vn.com.cyberlogitec.config;

public class Room1 implements Room {
	private Animal ani;
	public Room1 (Animal ani) {
		this.ani = ani;
	}
	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return ani.getName();
	}
	@Override
	public String getRoom() {
		// TODO Auto-generated method stub
		return "Room 1" ;
	}
}
