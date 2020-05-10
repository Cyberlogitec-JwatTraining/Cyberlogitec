package vn.com.cyberlogitec.exercise1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bird implements Animal {
	public String getName() {
		return "Bird";
	}

	@PostConstruct
	public void customInit() {
		System.out.println("Method customInit() invoked");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("Method customDestroy() invoked");
	}
}
