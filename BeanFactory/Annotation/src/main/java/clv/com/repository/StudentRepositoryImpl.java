package clv.com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import clv.com.model.Student;

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {

	public List<Student> getAllStudent() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Thai Thanh Xuan", "Binh Duong"));
		return studentList;
	}

}
