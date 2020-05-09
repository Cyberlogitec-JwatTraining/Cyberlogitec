package vn.com.cyberlogitec.beanfactory.annotation;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context1.xml");
		
//		ClassPathResource resource = new ClassPathResource("context1.xml");
//		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//		reader.loadBeanDefinitions(resource);
		
		IStudentService service = context.getBean("stuService", StudentService.class);
//		IStudentService service = factory.getBean("stuService", StudentService.class);
		System.out.println(service.getStudents().get(0));
		
		( (AbstractApplicationContext) context).close();

	}

}
