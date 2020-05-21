package com.cyberlogitec.jwat.springmybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.cyberlogitec.jwat.springmybatis.config.AppConfig;
import com.cyberlogitec.jwat.springmybatis.mapper.UserMapperUsingAnnotation;
import com.cyberlogitec.jwat.springmybatis.model.User;
import com.cyberlogitec.jwat.springmybatis.service.UserService;

@SpringBootApplication
public class SpringmybatisApplication {

	public static void main(String[] args)  {
		//Using XML
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService) context.getBean("userService", UserService.class);
        
        //userService.deleteUserById(9);
        userService.insertUser(new User(9,"jack",0,"goo@gmail.com","784674",1));
        List<User> listUsers = userService.selectAllUser();
        System.out.println("select all : ");
        for (User user : listUsers) {
            System.out.println(user);
            
        }
        
//        User user1 = userService.selectUserById(1);
//        user1.setName("WYZZ");
//        userService.updateUser(user1);
//        System.out.println(user1);
        
        
	}

}
