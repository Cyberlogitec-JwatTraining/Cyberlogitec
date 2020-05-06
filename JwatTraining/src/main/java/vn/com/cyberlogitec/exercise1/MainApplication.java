package vn.com.cyberlogitec.exercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class MainApplication {
	
	public static void main(String[] args) {
		
		System.out.println("Room1 below constructor-based DI: ");
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
		Room1 room1 = (Room1) context.getBean("room1");
		Bird birdInRoom = room1.getAnimal();
		System.out.println(birdInRoom.getName());
		System.out.println(room1.getRoom());
		
		System.out.println("Room2 below setter-based DI: ");
		Room2 room2 = (Room2) context.getBean("room2");
		Dog dogInRoom = room2.getAnimal();
		System.out.println(dogInRoom.getName());
		System.out.println(room2.getRoom());
		
		System.out.println("Room3 below field-based DI: ");
		Room3 room3 = (Room3) context.getBean("room3");
		Cat catInRoom = room3.getAnimal();
		System.out.println(catInRoom.getName());
		System.out.println(room3.getRoom());
		
//		Bird bird = new Bird();
//		Dog dog = new Dog();
//		Cat cat = new Cat();
				
//		Room1 room1 = new Room1(bird);
//		Bird birdInRoom = room1.getAnimal();
//		System.out.println(birdInRoom.getName());
//		System.out.println(room1.getRoom());
//		
//		System.out.println("Room2 below setter-based DI: ");
//		Room2 room2 = new Room2();
//		room2.setDog(dog);
//		Dog dogInRoom = room2.getAnimal();
//		System.out.println(dogInRoom.getName());
//		System.out.println(room2.getRoom());
		
	}
}
