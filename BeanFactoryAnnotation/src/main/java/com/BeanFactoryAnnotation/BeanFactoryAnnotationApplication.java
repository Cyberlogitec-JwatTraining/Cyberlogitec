package com.BeanFactoryAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Service.StudentService;



@SpringBootApplication
public class BeanFactoryAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanFactoryAnnotationApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StudentService service = context.getBean("studentService", StudentService.class);
		
		service.addNewStd();
		System.out.println(service.getAllStudent().get(0));
		
		((ConfigurableApplicationContext) context).close();
	}
	

}
