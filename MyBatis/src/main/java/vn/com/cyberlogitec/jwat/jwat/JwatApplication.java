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
		 
		/* select student by id */
		System.out.println("select student by id : ");
		Student student2 = studentService.selectStudentById(4);
		System.out.println(student2.toString());
		     
		/* Câu 1 */
		List<Student> listStudents1 = studentService.selectStudentByName("Jim");
		System.out.println("select student by name [Jim]: ");
		for (Student student : listStudents1) {
			System.out.println(student);
		}
		 
		/* Câu 2 */
		System.out.println("Select data of Student based on Name");
		Student studentN = new Student();
		studentN.setName("Pham Xuan Bach");
		List<Student> listStudent2 = studentService.selectStudentByNameOrPhone(studentN);
		for (Student student : listStudent2) {
			System.out.println(student);
		}
		
		System.out.println("Select data of Student based on Phone");
		Student studentP = new Student();
		studentP.setPhone(91112);
		List<Student> listStudent3 = studentService.selectStudentByNameOrPhone(studentP);
		for (Student student : listStudent3) {
			System.out.println(student);
		}
		
		/* Câu 3 */
		List<Student> listStudents4 = studentService.selectStudentByMultiId(new int[] { 2, 3, 4 });
		System.out.println("Select students by multiple IDs : ");
		for (Student student : listStudents4) {
			System.out.println(student);
		}
		
		/* Câu 4 */
		System.out.println("Update student by id");
		Student student1 = new Student(0,"Tran Minh Triet","Co So Bao Loc",95,12345,"minhtriet@jwat.com");
		studentService.updateStudentById(student1);
		
		/* select all student */
 		List<Student> listStudents = studentService.selectAllStudent();
		System.out.println("select all student : ");
		for (Student student : listStudents) {
		    System.out.println(student);
		}
	}

}
