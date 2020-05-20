package clv.com.service;

import java.util.List;

import clv.com.model.Student;
import clv.com.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl() {
		super();
		System.out.println("Default Constructer");
	}
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		System.out.println("Constructer with Paramerter");
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudent() {
		return studentRepository.getAllStudent();
	}

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	
	public void setStudentRepository(StudentRepository studentRepository) {
		System.out.println("Setter");
		this.studentRepository = studentRepository;
	}
	
}
