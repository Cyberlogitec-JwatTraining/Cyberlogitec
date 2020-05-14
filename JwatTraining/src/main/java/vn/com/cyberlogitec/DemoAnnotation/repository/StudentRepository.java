package vn.com.cyberlogitec.DemoAnnotation.repository;

import java.util.List;
import vn.com.cyberlogitec.DemoAnnotation.model.Student;

public interface StudentRepository {
	
	List<Student> getAllStudent();
	void addNewStudent(Student student);
}
