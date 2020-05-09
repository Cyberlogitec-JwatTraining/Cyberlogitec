package vn.com.cyberlogitec.beanfactory.context;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public class StudentService implements IStudentService {
	
	private IStudentRepository studentRepository;
	public StudentService(IStudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepository.getStudentRepository();
	}
	public void setStudentRepository(IStudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
}
