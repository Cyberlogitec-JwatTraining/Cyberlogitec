package vn.com.cyberlogitec.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class room1 implements Room{
	private Animal animal;

	public room1(Animal cat) {
		this.animal = cat;
	}

	@Override
	public Animal getAnimal() {
		return animal;
	}

	@Override
	public String getRoom() {
		return "Room 1";
	}
	
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method rooom 1 after properties are set : ");
	}
	
	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("Spring Container is destroy! Customer clean up");
	}
}