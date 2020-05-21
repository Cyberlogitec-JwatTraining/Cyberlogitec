package com.cyberlogitec.jwat.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cyberlogitec.jwat.config.AppConfig;
import com.cyberlogitec.jwat.entity.Student;
import com.cyberlogitec.jwat.service.StudentService;

public class StudentTest {
	public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = (StudentService) context.getBean("studentService");
       
        // Select all student
        List<Student> listStudents = studentService.selectAllStudent();
        System.out.println("Student information: ");
        for (Student student : listStudents) {
            System.out.println(student);
        } 
        
        //Select student by name(if condition)
//        Student student2 = studentService.getStudentByName("Pham Xuan Bach");
//        System.out.println(student2.toString());
//        
//        //Select student by name or phone(choose)
//        Student searchStudent = new Student("Nguyen Thanh Binh",null,0, 123456789,null);
//        Student searchStudent2 = new Student(null,null,0, 123456789,null);
//       
//        Student studentDemo1 = studentService.getStudentByName_Id_phone(searchStudent);
//        Student studentDemo2 = studentService.getStudentByName_Id_phone(searchStudent2);
//        System.out.println(studentDemo1.toString());
//        System.out.println(studentDemo2.toString());
//        
//        //Select student on multiID (foreach)
//        List<Integer> listId = new ArrayList<Integer>();
//        listId.add(2);
//        listId.add(3);
//        List<Student> listStudents2 = studentService.selectMultiID(listId);
//        for(Student stu: listStudents2) {
//        	System.out.println(stu);
//        }
//        
//        //Update student(set)
//        Student stuUpdate = studentService.selectStudentById(2);
//        stuUpdate.setPercentage(90);
//        studentService.updateStudent(stuUpdate);
//        System.out.println("Update: "+ stuUpdate);
        
        //Insert student
//        Student newStudent = new Student("Bui Quoc Khai", "Java Dev", 95, 1234568, "khai@gmail.com");
//        studentService.insertStudent(newStudent);
//        System.out.println("insert : " + newStudent);
        
        //Insert multi student info
        context.close();
    }
}
