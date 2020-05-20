package clv.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import clv.com.service.StudentService;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StudentService service = context.getBean("studentService", StudentService.class);
		
		System.out.println(service.getAllStudent().get(0));
		
		((ConfigurableApplicationContext) context).close();
	}
	
}
