package vn.com.cyberlogitec.exercise1;

public class Room1 implements Room {
	private Bird bird;

	public Room1(Bird injectedBird) {
		this.bird = injectedBird;
	}

	public String getRoom() {
		return "1";
	}

	public Bird getAnimal() {
		return this.bird;
	}
}
