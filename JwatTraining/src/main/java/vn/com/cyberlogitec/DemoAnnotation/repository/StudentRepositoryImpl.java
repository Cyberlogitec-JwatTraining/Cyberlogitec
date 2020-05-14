package vn.com.cyberlogitec.DemoAnnotation.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import vn.com.cyberlogitec.DemoAnnotation.model.Student;

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository{
	List<Student> studentList = new ArrayList<Student>();
	
	public List<Student> getAllStudent() {
		return studentList;
	}
	
	public void addNewStudent(Student student) {
		studentList.add(student);
	}
}
