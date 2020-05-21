package vn.com.cyberlogitec.DemoContext.service;

import java.util.List;

import vn.com.cyberlogitec.DemoContext.model.Student;
import vn.com.cyberlogitec.DemoContext.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl() {
		super();
		System.out.println("Default Constructor");
	}
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
		System.out.println("Parameter Constructor");
	}

	@Override
	public List<Student> getAllStudent() {
		System.out.println("getAllStudent");
		return studentRepository.getAllStudent();
	}

	@Override
	public void addNewStudent(Student student) {
		studentRepository.addNewStudent(student);
		System.out.println("addNewStudent");
	}

}
