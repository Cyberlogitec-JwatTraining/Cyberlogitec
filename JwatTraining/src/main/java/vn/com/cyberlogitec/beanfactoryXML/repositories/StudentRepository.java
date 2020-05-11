package vn.com.cyberlogitec.beanfactoryXML.repositories;

import java.util.List;

import vn.com.cyberlogitec.beanfactoryXML.models.Student;

public interface StudentRepository {
	List<Student> getAllStudents();
	void addNewStudent(Student student);
}
