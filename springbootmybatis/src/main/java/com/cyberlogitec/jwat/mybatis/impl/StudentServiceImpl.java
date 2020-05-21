package com.cyberlogitec.jwat.mybatis.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyberlogitec.jwat.mybatis.model.StudentModel;
import com.cyberlogitec.jwat.mybatis.myEnum.StringReturnEnum;
import com.cyberlogitec.jwat.mybatis.pojo.Student;
import com.cyberlogitec.jwat.mybatis.repo.StudentRepository;
import com.cyberlogitec.jwat.mybatis.service.IStudentService;

@Service(value = "studentService")
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public String deleteStudentById(int studentId) {
		// TODO Auto-generated method stub
		try {
			studentRepository.deleteStudentById(studentId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return StringReturnEnum.DELETE_SUCCESS.getText();
	}
	
	@Override
	public String insertStudent(StudentModel studentModel) {
		// TODO Auto-generated method stub
		Student newStudent = new Student();
		BeanUtils.copyProperties(studentModel, newStudent);
		
		try {
			studentRepository.insertStudent(newStudent);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return StringReturnEnum.ADD_SUCCESS.getText();
	}
	
	@Override
	public List<Student> selectAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.selectAllStudent();
	}
	
	@Override
	public Student selectStudentById(int studentId) {
		// TODO Auto-generated method stub
		return studentRepository.selectStudentById(studentId);
	}
	
	@Override
	public String updateStudent(StudentModel studentModel) {
		// TODO Auto-generated method stub
		Student editStudent = new Student();
		BeanUtils.copyProperties(studentModel, editStudent);
		try {
			studentRepository.updateStudent(editStudent);
		} catch (Exception e) { 
			// TODO: handle exception
			e.printStackTrace();
		}
		return StringReturnEnum.UPDATE_SUCCESS.getText();
	}
	
	@Override
	public Student selectStudentByName(String name) {
		// TODO Auto-generated method stub
		return studentRepository.selectStudentByName(name);
	}
	
	@Override
	public Student selectStudentByNameOrPhone(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.selectStudentByNameOrPhone(student);
	}
	
	@Override
	public List<Student> selectStudentByUserInput(StudentModel studentModel) {
		// TODO Auto-generated method stub
		Student student = new Student();
		BeanUtils.copyProperties(studentModel, student); // coppy properties of model to pojo
		return studentRepository.selectStudentByUserInput(student);
		
	}
}
