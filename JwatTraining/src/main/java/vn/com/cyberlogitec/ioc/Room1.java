package vn.com.cyberlogitec.ioc;

public class Room1 implements Room {
	private Animal ani;
	public Room1(Animal ani) {
		this.ani = ani;
	}
	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return ani.getname();
	}

	@Override
	public String getRoom() {
		// TODO Auto-generated method stub
		return "Room 1";
	}
	
}
