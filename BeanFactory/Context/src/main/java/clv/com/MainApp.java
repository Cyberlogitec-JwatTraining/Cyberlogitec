package clv.com;

import org.apache.log4j.lf5.util.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import clv.com.service.StudentService;

public class MainApp {

	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
//		BeanFactory context = new XmlBeanFactory();
		
		ClassPathResource resource = new ClassPathResource("context.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		
		System.out.println("-----Before getBean-----");
		
//		StudentService service = context.getBean("studentService", StudentService.class);
		
		StudentService service = factory.getBean("studentService", StudentService.class);
		
		System.out.println("-----After getBean------");
		
		System.out.println(service.getAllStudent().get(0));
	}
	
}
