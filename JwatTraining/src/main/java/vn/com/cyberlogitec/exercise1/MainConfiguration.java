package vn.com.cyberlogitec.exercise1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//Indicates that a class declares one or more @Bean methods 
//and may be processed by the Spring container 
//to generate bean definitions and service requests for those beans at runtime
public class MainConfiguration {
	@Bean
	public Bird bird() {
		return new Bird();
	}

	@Bean
	public Room1 room1() {
		return new Room1(bird());
	}

	@Bean
	public Dog dog() {
		return new Dog();
	}

	@Bean
	public Room2 room2() {
		Room2 r2 = new Room2();
		r2.setDog(dog());
		return r2;
	}

	@Bean
	public Cat cat() {
		return new Cat();
	}

	@Bean
	Room3 room3() {
		return new Room3();
	}
}
