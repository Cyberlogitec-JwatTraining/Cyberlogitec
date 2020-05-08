package vn.com.cyberlogitec.BeanFactory;

import java.util.ArrayList;

public class StudentRepositoryUsingXML implements StudentRepository {

	private ArrayList<Student> listStudent = new ArrayList<Student>();
	
	@Override
	public void addNewStudent(String name, String id) {
		listStudent.add(new Student(name, id));
	}

	@Override
	public ArrayList<Student> getListStudent() {
		return listStudent;
	}

}
