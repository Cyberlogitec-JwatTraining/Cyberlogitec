package vn.com.cyberlogitec.DemoAnnotation.service;

import java.util.List;

import vn.com.cyberlogitec.DemoAnnotation.model.Student;

public interface StudentService {
	List<Student> getAllStudent();
	void addNewStudent(Student student);
}
