package vn.com.cyberlogitec.day02;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository("studentRepository")
public class StudentRepository {
	private ArrayList<Student> list = new ArrayList<>();
	
	public ArrayList<Student> getAllStudents(){
		addNewStudent(new Student("1","ABC"));
		return this.list;
	}
	public void addNewStudent(Student student) {
		list.add(student);
	}
}
