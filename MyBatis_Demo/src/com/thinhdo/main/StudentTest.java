package com.thinhdo.main;

import java.util.ArrayList;
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
        List<Student> listStudents = studentService.selectAllStudent();
        System.out.println("select all : ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        
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
        
        /**
         * Search student by student's phone OR name....
         */
//        System.out.println("Enter name OR phone number to search: ");
//        System.out.print("Enter name: "); 
//        String name = sc.nextLine();
//        
//        int phone = 0;
//        System.out.print("Enter phone: "); 
//        try {
//        	phone = Integer.parseInt(sc.nextLine());
//        }catch(NumberFormatException nfe) {
//        	System.out.println("So dien thoai khong hop le");
//        }
//        
//        Student findStudent = new Student();
//        findStudent.setName(name); findStudent.setPhone(phone);
//        
//        System.out.println("Searching for: " + findStudent.getName() + ", Phone: " + findStudent.getPhone());
//        
//        List<Student> studentFound = studentService.selectStudentByPhoneOrName(findStudent);
//        if(studentFound!=null) {
//        	for(Student student : studentFound) {
//        		System.out.println("Info: " + student.toString()); 
//        	}
//        }
        
//          System.out.println("Enter ID(s) for searching: ");
//          int id_input = -1; 
//          List<Integer> listIDs = new ArrayList<Integer>();
//          do {
//        	  System.out.print("Enter id (input -1 for EXIT): ");
//        	  try {
//        		  id_input = Integer.parseInt(sc.nextLine());
//        		  if(id_input>-1) {
//        			  listIDs.add(id_input);
//        		  }
//        	  }catch(NumberFormatException nfe) {
//        		  System.out.println("Xin moi nhap so");
//        	  }
//          }while(id_input!=-1);
//          System.out.println("So luong id vua nhap: " + listIDs.size());
//          List<Student> studentFoundByIds = studentService.selectStudentByIds(listIDs);
//          if(studentFoundByIds!=null) {
//        	  if(studentFoundByIds.size()!=0) {
//        		  System.out.println("Da tim thay " + studentFoundByIds.size() + " hop le: ");
//        		  for(Student student : studentFoundByIds) {
//        			  System.out.println(student.toString());
//        		  }
//        	  }else {
//        		  System.out.println("Khong tim thay sinh vien phu hop");
//        	  }
//          }
          
    }
}
