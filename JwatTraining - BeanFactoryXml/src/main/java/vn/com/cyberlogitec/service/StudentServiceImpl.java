package vn.com.cyberlogitec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.cyberlogitec.model.Student;
import vn.com.cyberlogitec.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository;
	
	public StudentServiceImpl() {
		super();
	}
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository=studentRepository;
	}

	public List<Student> getAllStudent() {
		return studentRepository.getAllStudent();
	}
	
	public void addStudent(String name,String location) {
		studentRepository.addStudent(new Student(name,location));
	}	
}