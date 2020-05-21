package com.cyberlogitec.jwat.springmybatis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cyberlogitec.jwat.springmybatis.config.AppConfig;
import com.cyberlogitec.jwat.springmybatis.model.User;
import com.cyberlogitec.jwat.springmybatis.service.UserService;

public class SpringmybatisSqlApp {
	public static void main(String[] args)  {
		//Using XML
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService) context.getBean("userService", UserService.class);
        
        //Search by name
//        List<User> listUsers = userService.selectUserByName("khoa");
//        System.out.println("select by name : ");
//        for (User user : listUsers) {
//            System.out.println(user);
//            
//        }
        
        //Search by name or account
        User findUser = new User();
        findUser.setAccount("ad");
        findUser.setName(null);
        System.out.println(findUser);
        List<User> listUsers = userService.selectUserByNameorAccount(findUser);
        System.out.println("select by name or account : ");
        if(listUsers != null) {
			for (User user : listUsers) {
				System.out.println(user);		      
			}
        }
        
        //Search by multi id
//        List<Integer> listID = new ArrayList<Integer>();
//        listID.add(5);
//        listID.add(13);
//        listID.add(15);
//        List<User> listUsers = userService.selectUserByMultiID(listID);
//        if(listUsers != null) {
//			for (User user : listUsers) {
//				System.out.println(user);		      
//			}
//        }
        
        //Update user by id use set
//        User user = userService.selectUserById(7);
//        user.setAccount("aakk@gmail.com");
//        userService.updateUserbyID(user);
        
        
        
	}
}
