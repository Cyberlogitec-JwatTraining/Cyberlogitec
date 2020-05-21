package vn.com.cyberlogitec.DemoContext.repository;

import vn.com.cyberlogitec.DemoContext.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

	List<Student> studentList = new ArrayList<Student>();
	
	public List<Student> getAllStudent() {
		return studentList;
	}
	
	public void addNewStudent(Student student) {
		studentList.add(student);
	}

}
