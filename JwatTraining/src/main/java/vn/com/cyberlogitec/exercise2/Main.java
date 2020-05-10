package vn.com.cyberlogitec.exercise2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.com.cyberlogitec.exercise2.model.Student;
import vn.com.cyberlogitec.exercise2.repository.StudentRepository;
import vn.com.cyberlogitec.exercise2.service.StudentService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
//		BeanFactory beanFactory = new Bean
		
		StudentRepository studentRepository = (StudentRepository) context.getBean("studentRepository", StudentRepository.class);
		System.out.println(studentRepository.addNewStudent(0, "hoangtuan").toString());
		
		StudentService studentService = (StudentService) context.getBean("studentService",StudentService.class);
		System.out.println(studentService.addNewStudent(1, "HoangTuan").toString());
		
		System.out.println("ok");
	}
}
