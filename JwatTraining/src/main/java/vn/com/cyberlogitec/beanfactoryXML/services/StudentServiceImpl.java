package vn.com.cyberlogitec.beanfactoryXML.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import vn.com.cyberlogitec.beanfactoryXML.models.Student;
import vn.com.cyberlogitec.beanfactoryXML.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl() {
		super();
		System.out.println("Default Constructor called");
	}
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
		System.out.println("Parameter Constructor called");
	}

	@Override
	public List<Student> getAllStudents() {
		System.out.println("getAllStudents: ");
		return studentRepository.getAllStudents();
	}

	@Override
	public void addNewStudent(Student student) {
		studentRepository.addNewStudent(student);
		System.out.println("Add new student called");
	}
}
