package vn.com.cyberlogitec.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.com.cyberlogitec.ioc.room.Room1;
import vn.com.cyberlogitec.ioc.room.Room2;
import vn.com.cyberlogitec.ioc.room.Room3;

public class MainApp {

	public static void main(String[] args) {
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfiguration.class);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		//get Bean
//		Room1 room1 = ctx.getBean(Room1.class);
//		Room2 room2 = ctx.getBean(Room2.class);
//		Room3 room3 = ctx.getBean(Room3.class);
		Room1 room1 = ctx.getBean("room1",Room1.class);
		Room2 room2 = ctx.getBean("room2",Room2.class);
		Room3 room3 = ctx.getBean("room3",Room3.class);
		
		//Print Bean
		System.out.println(room1.getRoom() + room1.getAnimal().getName());
		System.out.println(room2.getRoom() + room2.getAnimal().getName());
		System.out.println(room3.getRoom() + room3.getAnimal().getName());
	}

}