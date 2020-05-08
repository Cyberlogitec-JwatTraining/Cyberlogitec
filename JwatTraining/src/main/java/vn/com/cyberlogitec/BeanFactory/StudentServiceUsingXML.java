package vn.com.cyberlogitec.BeanFactory;

import java.util.ArrayList;

public class StudentServiceUsingXML implements StudentService {
	
	private StudentRepository repository;
	
	public StudentServiceUsingXML() {

	}

	public StudentServiceUsingXML(StudentRepository repository) {
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
