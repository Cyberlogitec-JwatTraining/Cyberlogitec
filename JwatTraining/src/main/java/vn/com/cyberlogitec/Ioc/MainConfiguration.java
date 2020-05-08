package vn.com.cyberlogitec.Ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

	@Bean
	public Bird initBird() {
		return new Bird();
	}
	
	@Bean
	public Cat initCat() {
		return new Cat();
	}
	
	@Bean
	public Dog initDog() {
		return new Dog();
	}
	
	@Bean
	public Room1 initRoom1() {
		return new Room1(initCat());
	}
	
	@Bean
	public Room2 initRoom2() {
		Room2 room2 = new Room2();
		room2.setAnimal(initBird());
		return room2;
	}
	
	@Bean
	public Room3 initRoom3() {
		return new Room3();
	}
}
