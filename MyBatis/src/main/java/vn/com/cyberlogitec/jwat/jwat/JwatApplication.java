package vn.com.cyberlogitec.jwat.jwat;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import vn.com.cyberlogitec.jwat.config.AppConfig;
import vn.com.cyberlogitec.jwat.model.Student;
import vn.com.cyberlogitec.jwat.service.StudentService;

@SpringBootApplication
public class JwatApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwatApplication.class, args);
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService studentService = (StudentService) context.getBean("studentService");
		
		/* create student */
		//Student student1 = new Student(11,"Jim", "CS Nha Trang", 95, 1234568, "jimdev@gmail.com");
		 
		 
		/* insert student */		
		//studentService.insertStudent(student1); 
		//System.out.println("insert : " + student1);
		 		 
		/* select all student */
 		List<Student> listStudents = studentService.selectAllStudent();
		System.out.println("select all : ");
		for (Student student : listStudents) {
		    System.out.println(student);
		}
		 
		/* select student by id */
		System.out.println("select student by id : ");
		Student student2 = studentService.selectStudentById(4);
		System.out.println(student2.toString());
		     
		/* select student by name */
		
		  List<Student> listStudents1 = studentService.selectStudentByName("Jim");
		  System.out.println("select student by name [Jim]: "); 
		  for (Student student:listStudents1){ 
			  System.out.println(student); 
		  }
		 
		/* update student */
		//student2.setPercentage(99); 
		//studentService.updateStudent(student2);
		//System.out.println("update : " + student2);
		 
		 
		/* delete student by id */
		//studentService.deleteStudentById(student2.getId());
		//System.out.println("delete : " + student2);		
	}

}
