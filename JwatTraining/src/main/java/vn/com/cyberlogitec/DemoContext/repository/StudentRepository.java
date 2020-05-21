package vn.com.cyberlogitec.DemoContext.repository;

import java.util.List;

import vn.com.cyberlogitec.DemoContext.model.Student;

public interface StudentRepository {
	List<Student> getAllStudent();
	void addNewStudent(Student student);
}
