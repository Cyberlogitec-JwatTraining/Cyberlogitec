package vn.com.cyberlogitec;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import vn.com.cyberlogitec.model.Student;
import vn.com.cyberlogitec.service.StudentService;
import vn.com.cyberlogitec.service.StudentServiceImpl;

public class EducationApp {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("context.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		StudentService studentService = factory.getBean("studentService", StudentService.class);
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//		StudentService studentService = context.getBean("studentService", StudentService.class);
		
		studentService.addStudent("Binh","HCM");
		System.out.println(studentService.getAllStudent().get(0));
//		((ConfigurableApplicationContext) context).close();
	}
	
}
