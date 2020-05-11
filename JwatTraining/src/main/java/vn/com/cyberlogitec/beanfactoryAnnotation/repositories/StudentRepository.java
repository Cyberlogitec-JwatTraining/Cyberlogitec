package vn.com.cyberlogitec.beanfactoryAnnotation.repositories;

import java.util.List;

import vn.com.cyberlogitec.beanfactoryAnnotation.models.Student;

public interface StudentRepository {
	List<Student> getAllStudents();
	void addNewStudent(Student student);
}
