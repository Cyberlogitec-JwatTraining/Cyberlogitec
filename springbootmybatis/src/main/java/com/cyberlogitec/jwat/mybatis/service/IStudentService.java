package com.cyberlogitec.jwat.mybatis.service;

import java.util.List;

import com.cyberlogitec.jwat.mybatis.model.StudentModel;
import com.cyberlogitec.jwat.mybatis.pojo.Student;

public interface IStudentService {

	public String insertStudent(StudentModel studentModel);
    public String updateStudent(StudentModel studentModel);
    public String deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
    public Student selectStudentByName(String name);
    public Student selectStudentByNameOrPhone(Student student);
	public List<Student> selectStudentByUserInput(StudentModel student);
}
