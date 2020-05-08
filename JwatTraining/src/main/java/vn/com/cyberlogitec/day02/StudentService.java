package vn.com.cyberlogitec.day02;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentService {
	private StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		System.out.println("Constructor injection");
		this.studentRepository = studentRepository;
	}
	
	public void setStudentRepository(StudentRepository studentRepository) {
		System.out.println("Setter injection");
		this.studentRepository = studentRepository;
	}
	
	public void addNewStudent(Student student) {
		studentRepository.addNewStudent(student);
	}
	
	public ArrayList<Student> getAllStudents(){
		return studentRepository.getAllStudents();
	}
}
