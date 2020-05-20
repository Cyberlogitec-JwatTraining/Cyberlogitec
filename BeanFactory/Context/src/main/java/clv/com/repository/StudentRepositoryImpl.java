package clv.com.repository;

import java.util.ArrayList;
import java.util.List;
import clv.com.model.Student;

public class StudentRepositoryImpl implements StudentRepository {

	public List<Student> getAllStudent() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Thai Thanh Xuan", "Binh Duong"));
		return studentList;
	}

}
