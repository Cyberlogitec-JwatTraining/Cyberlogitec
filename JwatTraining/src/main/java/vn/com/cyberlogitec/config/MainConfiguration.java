package vn.com.cyberlogitec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {
	@Bean
	public Cat getCat() {
		return new Cat();
	}
	@Bean
	public Dog getDog() {
		return new Dog();
	}
	@Bean
	public Bird getBird() {
		return new Bird();
	}
	@Bean
	public Room getRoom1() {
		Room1 room1 = new Room1(getCat());
		return room1;
	}
	@Bean
	public Room getRoom2() {
		Room2 room2 = new Room2(getDog());	
		return room2;
	}
	@Bean
	public Room getRoom3() {
		Room3 room3 = new Room3(getBird());
		return room3;
	}
}
