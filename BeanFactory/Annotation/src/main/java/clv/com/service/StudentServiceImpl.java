package clv.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clv.com.model.Student;
import clv.com.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	public StudentServiceImpl() {
		super();
		System.out.println("Default Constructer");
	}

	public List<Student> getAllStudent() {
		return studentRepository.getAllStudent();
	}
	
}