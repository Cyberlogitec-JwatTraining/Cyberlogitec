package vn.com.cyberlogitec.IocDI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vn.com.cyberlogitec.IocDI.room.Room1;
import vn.com.cyberlogitec.IocDI.room.Room2;
import vn.com.cyberlogitec.IocDI.room.Room3;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfiguration.class);
		Room1 room1 = ctx.getBean(Room1.class);
		System.out.println(room1.getAnimal().getName() + " in " + room1.getRoom());
	    Room2 room2 = ctx.getBean(Room2.class);
		System.out.println(room2.getAnimal().getName() + " in " + room2.getRoom());
		Room3 room3 = ctx.getBean(Room3.class);
		System.out.println(room3.getAnimal().getName() + " in " + room3.getRoom());
	}
}
