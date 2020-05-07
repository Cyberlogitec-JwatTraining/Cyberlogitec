package vn.com.cyberlogitec.practice_02.AnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.com.cyberlogitec.practice_02.AnnotationConfig.service.IService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextAnnotationConfig.xml");
		System.out.println("---Before GetBean---");
		IService employeeService = context.getBean("employeeService", IService.class);
		System.out.println("---After getBean---");
		System.out.println("Name: " + employeeService.findAll().get(0).getName() + " Age: " + employeeService.findAll().get(0).getAge());
		((ConfigurableApplicationContext) context).close();
	}

}
