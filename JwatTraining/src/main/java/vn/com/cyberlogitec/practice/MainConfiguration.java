package vn.com.cyberlogitec.practice;

import org.springframework.context.annotation.Bean;

public class MainConfiguration {

	@Bean
	public Cat cat() {
		return new Cat();
	}
	
	@Bean 
	public Dog dog() {
		return new Dog();
	}
	
	@Bean 
	public Bird bird() {
		return new Bird();
	}
	
	@Bean
	public Room1 room1() {
		Room1 room1 = new Room1();
		room1.setPet(cat());
		
		return room1;
	}
	
	@Bean
	public Room2 room2() {
		Room2 room2 = new Room2(bird());
		
		return room2;
	}
	
	@Bean
	public Room3 room3() {
		Room3 room3 = new Room3(dog());
		
		return room3;
	}
	
}
