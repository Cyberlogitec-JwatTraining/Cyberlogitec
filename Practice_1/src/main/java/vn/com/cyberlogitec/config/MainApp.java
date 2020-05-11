package vn.com.cyberlogitec.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String args[]){
		ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfiguration.class);
		Room room1 = ac.getBean(Room1.class);
		System.out.println(room1.getRoom()+ ":"+room1.getAnimal());
		Room room2 = ac.getBean(Room2.class);
		System.out.println(room2.getRoom()+ ":"+room2.getAnimal());
		Room room3 = ac.getBean(Room3.class);
		System.out.println(room3.getRoom()+ ":"+room3.getAnimal());
	}
}