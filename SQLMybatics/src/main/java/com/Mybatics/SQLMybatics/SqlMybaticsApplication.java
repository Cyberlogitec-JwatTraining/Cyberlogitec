package com.Mybatics.SQLMybatics;


import java.util.ArrayList;
import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.Mybatics.Config.StudentConfig;
import com.Mybatics.Mapper.StudentMapper;
import com.Mybatics.Model.Student;
import com.Mybatics.Service.StudentService;








@SpringBootApplication
public class SqlMybaticsApplication {

	public static void main(String[] args)  {
		SpringApplication.run(SqlMybaticsApplication.class, args);
		
		 final AbstractApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	     final StudentService studentService = (StudentService) context.getBean("studentService");
	     
	     
	   
	     
	     // create student
	        final Student student1 = new Student(1, "sang", "Java Dev", 95, 1234568, "sangabc@gmail.com");

	        // insert student
	        studentService.insertStudent(student1);
	        System.out.println("insert : " + student1);

	      
	        // select student by id
	        final Student student2 = studentService.selectStudentById(1);
	        
	        // update student2 just selected
	        student2.setPercentage(99);
	        studentService.updateStudent(student2);
	        System.out.println("update : " + student2);
	        
	        // delete student by id
	        studentService.deleteStudentById(student2.getId());
	        System.out.println("delete : " + student2);
	        
	        StudentMapper studentMapper = null;
	        
	        
	        
	        
	        // select all student
	        final List<Student> listStudents = studentService.selectAllStudent();
	        System.out.println("select all : ");
	        for (final Student student : listStudents) {
	            System.out.println(student);
	        }

	       
	        
	        
//	        select student by name
            final List<Student> listStudentByName = studentService.selectStudentByName(studentMapper, "sang");
	        System.out.println("select list students by name : ");
	        for (final Student student : listStudentByName) {
	            System.out.println(student);
	        }
	        
	        
//	        select student by name or phone
	        final List<Student> listStudentByNameOrPhone = studentService.selectStudentByNameOrPhone(studentMapper, "sang", 1234);
	        System.out.println("select list students by name : ");
	        for (final Student student : listStudentByNameOrPhone) {
	            System.out.println(student);
	        }
		
	       
//	        Select student by list id
	        List<Integer> listId = new ArrayList<Integer>();
	        final List<Student> listStudentByListID = studentService.selectStudentByListId(studentMapper, listId);
	        System.out.println("select list students by name : ");
	        for (final Student student : listStudentByListID) {
	            System.out.println(student);
	        }
	        
	        

	       

	}

}
