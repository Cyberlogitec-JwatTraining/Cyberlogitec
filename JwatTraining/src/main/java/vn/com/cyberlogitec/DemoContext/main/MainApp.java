package vn.com.cyberlogitec.DemoContext.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import vn.com.cyberlogitec.DemoContext.model.Student;
import vn.com.cyberlogitec.DemoContext.service.StudentService;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathResource resource = new ClassPathResource("context.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		
		StudentService service = factory.getBean("studentService", StudentService.class);
		
		service.addNewStudent(new Student(1, "Tran Minh Triet", "male"));
		System.out.println("-----After getBean------");
		
		System.out.println(service.getAllStudent().get(0));
	}

}
