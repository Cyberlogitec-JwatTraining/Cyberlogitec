package com.thinhdo.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.thinhdo.config.AppConfig;
import com.thinhdo.entity.Student;
import com.thinhdo.service.StudentService;

public class StudentTest {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = (StudentService) context.getBean("studentService");
        
        // create student
//        Student student1 = new Student("Jim", "Java Dev", 95, 1234568, "jimdev@gmail.com");
        
        // insert student
//        studentService.insertStudent(student1);
//        System.out.println("insert : " + student1);
        
        // select all student
//        List<Student> listStudents = studentService.selectAllStudent();
//        System.out.println("select all : ");
//        for (Student student : listStudents) {
//            System.out.println(student);
//        }
        
        // select student by id
//        Student student2 = studentService.selectStudentById(1);
                
        // update student
//        student2.setPercentage(99);
//        studentService.updateStudent(student2);
//        System.out.println("update : " + student2);
        
        // delete student by id
//        studentService.deleteStudentById(student2.getId());
//        System.out.println("delete : " + student2);
        
        // Select student by Name
//        System.out.print("Enter name to search: "); String name = sc.nextLine();
//        List<Student> listStudentsFound = studentService.selectStudentsByName(name);
//        System.out.println("select all : ");
//        for (Student student : listStudentsFound) {
//            System.out.println(student);
//        }
        
        System.out.println("Enter name OR phone number to search: ");
        System.out.print("Enter name: "); String name = sc.nextLine();
        System.out.print("Enter phone: ");
        String p = sc.nextLine();
        int phone = 0;
        if(!p.equals("")) {
        	phone = Integer.parseInt(p);
        }
        Student findStudent = new Student();
        findStudent.setName(name); findStudent.setPhone(phone);
        
        Student student = studentService.selectStudentByPhoneOrName(findStudent);
        if(student!=null) {
        	System.out.println("STUDENT FOUND: ");
        	System.out.println(student.toString());
        }
    }
}
