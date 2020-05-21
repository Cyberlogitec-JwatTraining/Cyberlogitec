package com.BeanFactory.BeanFactoryXML;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;


import com.BeanFactory.BeanFactoryXML.Service.StudentService;


@SpringBootApplication
public class BeanFactoryXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanFactoryXmlApplication.class, args);
		
		ClassPathResource resource = new ClassPathResource("context.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		
		System.out.println("-----Before getBean-----");
		
//		StudentService service = context.getBean("studentService", StudentService.class);
//		
		StudentService service = factory.getBean("studentService", StudentService.class);
		
		System.out.println("-----After getBean------");
		
		service.addNewStd();
		System.out.println(service.getAllStudent().get(0));
	}
		
	}


