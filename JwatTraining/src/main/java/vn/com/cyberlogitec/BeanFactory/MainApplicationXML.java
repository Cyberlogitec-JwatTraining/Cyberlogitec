package vn.com.cyberlogitec.BeanFactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class MainApplicationXML {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("ConfigXML.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		
		StudentService service = factory.getBean("studentService", StudentService.class);
		service.addNewStudent("Khoa", "001");
		service.addNewStudent("BCA", "002");
		service.addNewStudent("FEG", "003");
		service.addNewStudent("DEB", "004");
		System.out.println(service.getListStudent());
	}
}
