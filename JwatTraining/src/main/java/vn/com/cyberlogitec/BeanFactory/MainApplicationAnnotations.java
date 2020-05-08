package vn.com.cyberlogitec.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplicationAnnotations {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ConfigAnnotations.xml");
		StudentService service = context.getBean("studentService", StudentService.class);
		
		service.addNewStudent("Khoa", "001");
		service.addNewStudent("ABC", "002");
		service.addNewStudent("CDE", "003");
		service.addNewStudent("EFG", "004");
		System.out.println(service.getListStudent());
	}
}
