package vn.com.cyberlogitec.beanfactoryXML.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.com.cyberlogitec.beanfactoryXML.models.Student;
import vn.com.cyberlogitec.beanfactoryXML.services.StudentService;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");
		
		StudentService studentService = context.getBean("studentService", StudentService.class);
		
		studentService.addNewStudent(new Student("1999", "Do Duy Thinh"));
		
		List<Student> students = studentService.getAllStudents();
		
		System.out.print("Number of student: " + students.size());
	}

}
