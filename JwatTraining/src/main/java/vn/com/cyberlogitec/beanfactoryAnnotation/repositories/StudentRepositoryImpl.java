package vn.com.cyberlogitec.beanfactoryAnnotation.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.com.cyberlogitec.beanfactoryAnnotation.models.Student;

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {

	List<Student> list = new ArrayList<Student>();
	
	@Override
	public List<Student> getAllStudents() {
		return list;
	}

	@Override
	public void addNewStudent(Student student) {
		list.add(student);
	}

}
