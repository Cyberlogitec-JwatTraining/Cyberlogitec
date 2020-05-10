package vn.com.cyberlogitec.practice_test2.ex1;

import java.util.List;

public interface Repository {
	public void addNewStudent(Student s);
	public List<Student> getStudentList();
}
