package vn.com.cyberlogitec.practice_test2.ex2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentService")
public class StudentServiceImp implements StudentService{
	@Autowired
	private StudentRepository studentRepo;
	
	
	public StudentServiceImp() {
		
		
	}
	public StudentServiceImp(StudentRepository studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}
	
	public void excuteAddStudent(Student s) {
		this.studentRepo.addNewStudent(s);
	}
	
	public List<Student> getStudents(){
		return this.studentRepo.getStudentList();
	}
}
