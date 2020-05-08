package vn.com.cyberlogitec.day01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
		Room room1 = context.getBean(Room1.class);
		System.out.println(room1.getRoom()+ ": "+room1.getAnimal());
		Room room2 = context.getBean(Room2.class);
		System.out.println(room2.getRoom()+ ": "+room2.getAnimal());
		Room room3 = context.getBean(Room3.class);
		System.out.println(room3.getRoom()+ ": "+room3.getAnimal());
		
		((ConfigurableApplicationContext) context).close();
	}
}