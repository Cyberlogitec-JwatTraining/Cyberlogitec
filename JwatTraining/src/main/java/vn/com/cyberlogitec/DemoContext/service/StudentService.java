package vn.com.cyberlogitec.DemoContext.service;

import vn.com.cyberlogitec.DemoContext.model.Student;
import java.util.List;

public interface StudentService {
	List<Student> getAllStudent();
	void addNewStudent(Student student);
}
