package vn.com.cyberlogitec.beanfactoryXML.services;

import java.util.List;

import vn.com.cyberlogitec.beanfactoryXML.models.Student;

public interface StudentService {
	List<Student> getAllStudents();
	void addNewStudent(Student student);
}
