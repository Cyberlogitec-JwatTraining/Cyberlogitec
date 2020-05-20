package vn.com.cyberlogitec.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		BeanFactory ac = new AnnotationConfigApplicationContext(MainConfiguration.class);

		Room room1 = ac.getBean(room1.class);
		System.out.println(room1.getRoom() + ": " + room1.getAnimal().getname());
	
		Room room2 = ac.getBean(room2.class);
		System.out.println(room2.getRoom() + ": " + room2.getAnimal().getname());

		Room room3 = ac.getBean(room3.class);
		System.out.println(room3.getRoom() + ": " + room3.getAnimal().getname());
	}

}
