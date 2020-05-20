package com.cyberlogitec.jwat.springbootmybatis;

import com.cyberlogitec.jwat.springbootmybatis.Entities.StudentInfo;
import com.cyberlogitec.jwat.springbootmybatis.Services.EmployeeService;
import com.cyberlogitec.jwat.springbootmybatis.Services.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMybatisApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}

	private final EmployeeService employeeService;
	private final StudentService studentService;

	public SpringBootMybatisApplication(EmployeeService employeeService, StudentService studentService) {
		this.employeeService = employeeService;
		this.studentService = studentService;
	}

	@Override
	@SuppressWarnings("squid:S106")
	public void run(String... args) {
		System.out.println("BEGIN");
//		System.out.println(employeeService.getEmployeeHasName("Steven","King"));
//		System.out.println(employeeService.getEmployeeHasLastName("King"));
//		System.out.println(employeeService.getEmployeeHasName("Steven",null));

		System.out.println("Get student by name");
		System.out.println(studentService.getStudentByName(null));
		System.out.println(studentService.getStudentByName("Binh 002"));

		System.out.println("Get student by name or phone");
		System.out.println(studentService.getStudentByNameOrPhone(null,null));
		System.out.println(studentService.getStudentByNameOrPhone("Binh 003",null));
		System.out.println(studentService.getStudentByNameOrPhone(null,"01234567890"));

		System.out.println("Get student by multi ids");
		System.out.println(studentService.getStudentByIds("1","3"));

		System.out.println("Insert multi students");
		studentService.insertStudent(
				new StudentInfo("Binh 099","HCMUT99",50,"09876543210","99@abc"),
				new StudentInfo("Binh 333","HCMUT333",33,"09876543333","333@abc")
		);
		System.out.println(studentService.getStudentByName("Binh 099"));
		System.out.println(studentService.getStudentByName("Binh 333"));

		System.out.println("Update student info");
		try {
			StudentInfo studentInfo = studentService.getStudentByIds("1").get(0);
			System.out.println(studentInfo);
			studentInfo.setEmail("modified@email");
			studentService.updateStudent("1",studentInfo);
			System.out.println(studentService.getStudentByIds("1").get(0));
		} catch (IndexOutOfBoundsException ignored){
			System.out.println("No student has id \"1\"");
		}
		System.out.println("END");
	}
}
