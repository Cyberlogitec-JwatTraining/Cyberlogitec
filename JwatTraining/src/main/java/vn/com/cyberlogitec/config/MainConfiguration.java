package vn.com.cyberlogitec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {
	@Bean
	public Animal bird() {
		return new bird();
	}
	//
	
	@Bean
	public Animal cat() {
		return new cat();
	}
	
	@Bean
	public Animal dog() {
		return new dog();
	}
	
	@Bean
	public Room room1() {
		return new room1(cat());
	}
	
	@Bean
	public Room room2() {
		room2 room2 = new room2();
		room2.setAnimal(dog());
		return room2;
	}
	
	@Bean
	public Room room3() {
		return new room3();
	}
}
