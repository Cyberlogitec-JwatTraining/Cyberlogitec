package com.cyberlogitec.jwat.mybatis.repo;

import java.util.List;

import com.cyberlogitec.jwat.mybatis.pojo.Student;

public interface StudentRepository {
	//function here
	public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
    public Student selectStudentByName(String name);
    public Student selectStudentByNameOrPhone(Student student);
	public List<Student> selectStudentByUserInput(Student student);
}
