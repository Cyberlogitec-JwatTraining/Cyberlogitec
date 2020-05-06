package vn.com.cyberlogitec.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainApp {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(MainConfiguration.class);
		
		// phong 1 pet meo
		IRoom room1 = context.getBean(Room1.class);
		System.out.println("name: " + room1.getRoom() + ", pet: " + room1.getAnimal());
		
		// phong 2 pet chim
		IRoom room2 = context.getBean(Room2.class);
		System.out.println("name: " + room2.getRoom() + ", pet: " + room2.getAnimal());
		
		// phong 3 pet cho
		IRoom room3 = context.getBean(Room3.class);
		System.out.println("name: " + room3.getRoom() + ", pet: " + room3.getAnimal());

	}
}
