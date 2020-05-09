package vn.com.cyberlogitec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.com.cyberlogitec.model.Student;
import vn.com.cyberlogitec.service.StudentService;
import vn.com.cyberlogitec.service.StudentServiceImpl;

public class EducationApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StudentService studentService = context.getBean("studentService", StudentService.class);
		
		studentService.addStudent("Binh","HCM");
		System.out.println(studentService.getAllStudent().get(0));
		((ConfigurableApplicationContext) context).close();
	}
	
}
