package vn.com.cyberlogitec.practice_02.XMLFileConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.com.cyberlogitec.practice_02.XMLFileConfig.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextXmlFileConfig.xml");
		System.out.println("---Before GetBean---");
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		System.out.println("---After getBean---");
		System.out.println("Name: " + employeeService.findAll().get(0).getName() + " Age: " + employeeService.findAll().get(0).getAge());
	}

}
