package vn.com.cyberlogitec.DemoAnnotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.cyberlogitec.DemoAnnotation.model.Student;
import vn.com.cyberlogitec.DemoAnnotation.repository.StudentRepository;


@Service("studentService")
public class StudentServiceImpl implements StudentService {
		//Spring field-based injection
		@Autowired
		private StudentRepository studentRepository;

		public StudentServiceImpl() {
			super();
			System.out.println("Default Constructer");
		}
		
		@Override
		public List<Student> getAllStudent() {
			System.out.println("getAllStudent() has been called");
			return studentRepository.getAllStudent();
		}

		@Override
		public void addNewStudent(Student student) {
			studentRepository.addNewStudent(student);
			System.out.println("addNewStudent() has been called");
		}
}
