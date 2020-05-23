package vn.com.cyberlogitec.jwat.jwat;

import java.util.Iterator;

import org.apache.catalina.Group;
import org.apache.catalina.Role;

import org.apache.catalina.UserDatabase;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import vn.com.cyberlogitec.jwat.config.AppConfig;
import vn.com.cyberlogitec.jwat.entity.User;
import vn.com.cyberlogitec.jwat.service.UserService;

@SpringBootApplication
//@MapperScan("vn.com.cyberlogitec.jwat")
@ComponentScan
public class JwatSpringMybatisApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(JwatSpringMybatisApplication.class, args);
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService) context.getBean("userService");
        
        // create student
//        User newUser= new User(1, "t@email", "password");
         
        // insert student
//        userService.insertUser(newUser);
//        System.out.println("insert : " + newUser);
         
        // select all student
//        List<Student> listStudents = studentService.selectAllStudent();
//        System.out.println("select all : ");
//        for (Student student : listStudents) {
//            System.out.println(student);
//        }
         
        // select student by id
        User student2 = userService.selectUserById(1);
               
        System.out.println(student2.toString());
        // update student
//        student2.setPercentage(99);
//        studentService.updateStudent(student2);
//        System.out.println("update : " + student2);
//         
        // delete student by id
//        studentService.deleteStudentById(student2.getId());
//        System.out.println("delete : " + student2);
	}

}
