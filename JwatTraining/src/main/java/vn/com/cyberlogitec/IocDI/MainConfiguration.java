package vn.com.cyberlogitec.IocDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vn.com.cyberlogitec.IocDI.animal.Bird;
import vn.com.cyberlogitec.IocDI.animal.Cat;
import vn.com.cyberlogitec.IocDI.animal.Dog;
import vn.com.cyberlogitec.IocDI.room.Room1;
import vn.com.cyberlogitec.IocDI.room.Room2;
import vn.com.cyberlogitec.IocDI.room.Room3;


@Configuration
public class MainConfiguration {
	
	@Bean
	public Cat cat() {
		return new Cat();
	}
	
	@Bean
	public Room1 room1() {
		return new Room1(cat());
	}
	
	@Bean
	public Dog dog() {
		return new Dog();
	}
	
	@Bean 
	public Room2 room2() {
		return new Room2(dog());
	
	}
	
	@Bean
	public Bird bird() {
		return new Bird();
	}
	
	@Bean
	public Room3 room3() {
		return new Room3(bird());
	}
}

