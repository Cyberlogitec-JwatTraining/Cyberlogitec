package vn.com.cyberlogitec.practice_test2.ex2;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository("StudentRepository")
public class StudentRepositoryImp implements StudentRepository{
	List<Student> list;
	
	public StudentRepositoryImp() {
		this.list = new ArrayList<Student>();
		
	}
	public StudentRepositoryImp(Student s) {
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
