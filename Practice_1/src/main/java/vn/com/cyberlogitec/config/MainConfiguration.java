package vn.com.cyberlogitec.config;

public class MainConfiguration {
	@Bean
	public Animal Dog() {
		return new Dog();
	}
	@Bean
	public Animal Cat() {
		return new Cat();	
	}
	@Bean
	public Animal Bird() {
		return new Bird();
	}
	@Bean
	public Room Room1() {
		return new Room1(Dog());
	}
	@Bean
	public Room Room2() {
		Room2 room = new Room2();
		room.setAnimal(Cat());
		return room
	}
	@Bean
	public Room Room3() {
		return new Room3();
	}
}
