package vn.com.cyberlogitec.BeanFactory;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceUsingAnnotations implements StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public StudentServiceUsingAnnotations() {

	}

	public StudentServiceUsingAnnotations(StudentRepository repository) {
		super();
		this.repository = repository;
	}
	

	public StudentRepository getRepository() {
		return repository;
	}

	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public void addNewStudent(String name, String id) {
		repository.addNewStudent(name, id);
	}

	@Override
	public ArrayList<Student> getListStudent() {
		return repository.getListStudent();
	}

}
