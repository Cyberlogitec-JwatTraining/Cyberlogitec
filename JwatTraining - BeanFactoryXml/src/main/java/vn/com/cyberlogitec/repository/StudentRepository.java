package vn.com.cyberlogitec.repository;

import java.util.List;

import vn.com.cyberlogitec.model.Student;

public interface StudentRepository {

	List<Student> getAllStudent();
	void addStudent(Student student);
}
