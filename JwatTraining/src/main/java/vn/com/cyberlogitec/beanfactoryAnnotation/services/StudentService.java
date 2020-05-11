package vn.com.cyberlogitec.beanfactoryAnnotation.services;

import java.util.List;

import vn.com.cyberlogitec.beanfactoryAnnotation.models.Student;

public interface StudentService {
	List<Student> getAllStudents();
	void addNewStudent(Student student);
}
