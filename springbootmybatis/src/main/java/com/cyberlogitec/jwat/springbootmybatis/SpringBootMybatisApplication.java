package com.cyberlogitec.jwat.springbootmybatis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMybatisApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}

	private final EmployeeService employeeService;
	public SpringBootMybatisApplication(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	@SuppressWarnings("squid:S106")
	public void run(String... args) {
		System.out.println(employeeService.getEmployeeFromId(100));
	}
}
