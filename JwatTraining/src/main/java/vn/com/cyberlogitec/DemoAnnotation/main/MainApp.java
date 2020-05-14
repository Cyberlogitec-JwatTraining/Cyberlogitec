package vn.com.cyberlogitec.DemoAnnotation.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.com.cyberlogitec.DemoAnnotation.model.Student;
import vn.com.cyberlogitec.DemoAnnotation.service.StudentService;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Context.xml");
		
		StudentService studentService = context.getBean("studentService", StudentService.class);
		
		studentService.addNewStudent(new Student(1, "Tran Minh Triet", "male"));
		
		List<Student> students = studentService.getAllStudent();
		
		System.out.println("Number of student: " + students.size());
		System.out.println("Info " + students.toString());
	}

}
