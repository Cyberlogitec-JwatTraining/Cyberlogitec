package vn.com.cyberlogitec.practice_test2.ex2;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.apache.log4j.lf5.util.Resource;

public class MainApp {
	private static ApplicationContext ctx;
	public static void main(String[] args) throws FileNotFoundException{
		//Context
		System.out.println("-------------Begin Application Context-------------");
		ctx = new ClassPathXmlApplicationContext("Beans_ex2.xml");
		System.out.println("--Begin get Bean--");
		StudentService ser = ctx.getBean("StudentService",StudentService.class);
		System.out.println("--After get Bean--");
		ser.excuteAddStudent(new Student("sv2","Nguyen Van A"));
		List<Student> rsList = ser.getStudents();
		for(Student s : rsList) {
			System.out.println(s.getId()+":"+s.getName());
		}
		System.out.println("-------------End Application Context-------------");
		
		
		
	}

}
