package vn.com.cyberlogitec.day02;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import vn.com.cyberlogitec.day02.StudentService;

public class MainApp {
	public static void main(String[] args) {
		//Application Context
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationConfig.xml");
		
		System.out.println("APPLICATION CONTEXT");
		System.out.println("-----Before getBean-----");
		StudentService service = context.getBean("studentService", StudentService.class);
		System.out.println("-----After getBean------");
		System.out.println(service.getAllStudents().get(0));
		((ConfigurableApplicationContext) context).close();
		
		//Bean Factory
		ClassPathResource resource = new ClassPathResource("XMLConfig.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		
		System.out.println("BEAN FACTORY");
		System.out.println("-----Before getBean-----");		
		service = factory.getBean("studentService", StudentService.class);
		System.out.println("-----After getBean------");
		System.out.println(service.getAllStudents().get(0));
	}
}
