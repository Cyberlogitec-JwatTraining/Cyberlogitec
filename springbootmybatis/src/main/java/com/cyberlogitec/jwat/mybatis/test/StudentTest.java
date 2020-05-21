package com.cyberlogitec.jwat.mybatis.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cyberlogitec.jwat.mybatis.config.AppConfig;
import com.cyberlogitec.jwat.mybatis.pojo.Student;
import com.cyberlogitec.jwat.mybatis.service.IStudentService;

public class StudentTest {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		IStudentService studentService = (IStudentService) context.getBean("studentService");

		/*
		 * List<Student> students = new ArrayList<Student>(); for (int i = 0; i < 10;
		 * i++) { Student student = new Student(); // create student 
		 * student.setName("Jim" + i); student.setBranch("Java Dev");
		 * student.setPercentage(95); student.setPhone(1234567);
		 * student.setEmail("jimdev" + i + "@gmail.com"); students.add(student); }
		 */

		/*
		 * List<Student> students = new ArrayList<Student>(); for (int i = 0; i < 10;
		 * i++) { Student student = new Student(); // create student
		 * student.setName("katie" + i); student.setBranch("Python Dev");
		 * student.setPercentage(95); student.setPhone(1234567);
		 * student.setEmail("katie" + i + "@gmail.com"); students.add(student); }
		 */

		/*
		 * List<Student> students = new ArrayList<Student>(); for (int i = 0; i < 10;
		 * i++) { Student student = new Student(); // create student
		 * student.setName("Jack" + i); student.setBranch("RuBy on Rails Dev");
		 * student.setPercentage(95); student.setPhone(1234567); student.setEmail("Jack"
		 * + i + "@gmail.com"); students.add(student); }
		 */

		/*
		 * for (Student student : students) { //// insert student
		 * studentService.insertStudent(student); System.out.println("insert : " +
		 * student); }
		 */

		// select all student
		List<Student> listStudents = studentService.selectAllStudent();
		System.out.println("select all : ");
		for (Student student : listStudents) {
			System.out.println(student);
		}

		Student studentByName = studentService.selectStudentByName("Jim3");

		System.out.println("----------------------------------------------------------");
		System.out.println(studentByName);

		Student studentByNameOrPhoneData = new Student();
		// studentByNameOrPhoneData.setName("Jim6");
		// studentByNameOrPhoneData.setPhone(1234567);
		Student studentByNameOrPhone = studentService.selectStudentByNameOrPhone(studentByNameOrPhoneData);
		System.out.println("----------------------------------------------------------");
		System.out.println(studentByNameOrPhone);

		// select student by id
		// Student student2 = studentService.selectStudentById(1);
		// System.out.println(student2.getName());
		//// update student student2.setPercentage(99);
		// studentService.updateStudent(student2);
		// System.out.println("update : " + student2);

		// delete student by id
		// studentService.deleteStudentById(student2.getId());
		// System.out.println("delete : " + student2);

	}
}
