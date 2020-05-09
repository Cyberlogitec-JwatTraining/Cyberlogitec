package vn.com.cyberlogitec.service;

import java.util.List;

import vn.com.cyberlogitec.model.Student;

public interface StudentService {

	List<Student> getAllStudent();
	void addStudent(String name,String location);
}