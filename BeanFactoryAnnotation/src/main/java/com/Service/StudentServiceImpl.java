package com.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Model.Student;
import com.Repository.StudentRepository;


@Service("studentService")
public class StudentServiceImpl implements StudentService {
	private StudentRepository stdRepository;

	public StudentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentServiceImpl(StudentRepository stdRepository) {
		super();
		this.stdRepository = stdRepository;
	}
	
	@Override
	public void addNewStd() {
		stdRepository.addNewStd();
		
	}

	public List<Student> getAllStudent() {
		return stdRepository.getAllStudent();
	}

	public StudentRepository getStdRepository() {
		return stdRepository;
	}

	public void setStdRepository(StudentRepository stdRepository) {
		this.stdRepository = stdRepository;
	}
}
