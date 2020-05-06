package vn.com.cyberlogitec.exercise1;

public class Room2 implements Room {
	private Dog dog;

	public void setDog(Dog injectedDog) {
		this.dog = injectedDog;
	}
	
	public Room2() {}
	
	public String getRoom() {
		return "2";
	}

	public Dog getAnimal() {
		return this.dog;
	}

}
