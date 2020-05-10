package vn.com.cyberlogitec.exercise2.repository;

import vn.com.cyberlogitec.exercise2.model.Student;

//@Repository("studentRepsitory")
public class StudentRepositoryImpl implements StudentRepository {
	public Student addNewStudent(int id, String name) {
		Student student = new Student(id, name);
		System.out.println("repo: " + student.toString());
		return new Student(id, name);
	}
}
