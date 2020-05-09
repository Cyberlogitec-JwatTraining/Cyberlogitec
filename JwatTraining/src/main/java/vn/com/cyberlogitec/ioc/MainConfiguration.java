package vn.com.cyberlogitec.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MainConfiguration {
	@Bean
	public Animal cat() {
		return new Cat();
		
	}
	@Bean
	public Animal dog() {
		return new Dog();
		
	}
	@Bean
	@Primary
	public Animal Bird() {
		return new Bird();
		
	}
	@Bean
	public Room Room1() {
		return new Room1(cat());
		
	}
	@Bean
	public Room Room2() {
		Room2 room2 = new Room2();
		room2.setAnimal(dog());
		return room2;
	}
	@Bean
	public Room Room3() {
		return new Room3();
		
	}
}
