package vn.com.cyberlogitec.practice_test2.ex2;

import java.util.List;

public interface StudentRepository {
	public void addNewStudent(Student s);
	public List<Student> getStudentList();
}
