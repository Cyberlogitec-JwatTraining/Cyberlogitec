package vn.com.cyberlogitec.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vn.com.cyberlogitec.ioc.animal.Bird;
import vn.com.cyberlogitec.ioc.animal.Cat;
import vn.com.cyberlogitec.ioc.animal.Dog;
import vn.com.cyberlogitec.ioc.room.Room1;
import vn.com.cyberlogitec.ioc.room.Room2;
import vn.com.cyberlogitec.ioc.room.Room3;

@Configuration
public class MainConfiguration {
	
	@Bean
	public Bird bird() {
		return new Bird();
	}
	
	@Bean
	public Dog dog() {
		return new Dog();
	}
	
	@Bean
	public Cat cat() {
		return new Cat();
	}
	
	@Bean
	public Room1 room1() {
		//Constructor-based DI
		return new Room1(bird());
	}
	
	@Bean
	public Room2 room2() {
		//Setter-Based DI
		Room2 room2 = new Room2();
		room2.setAnimal(cat());
		return room2;
	}
	
	@Bean
	public Room3 room3() {
		//Field-Based DI
		return new Room3();
	}
}
