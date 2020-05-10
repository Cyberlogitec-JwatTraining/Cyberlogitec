package vn.com.cyberlogitec.practice_test2.ex1;

import java.util.List;
import java.util.ArrayList;


public class RepositoryImp implements Repository{
	List<Student> list;
	
	public RepositoryImp() {
		this.list = new ArrayList<Student>();
		
	}
	public RepositoryImp(Student s) {
		this.list = new ArrayList<Student>();
		this.list.add(s);
	}


	public void addNewStudent(Student s) {
		list.add(s);
	}
	
	public List<Student> getStudentList() {
		return list;
	}
}
