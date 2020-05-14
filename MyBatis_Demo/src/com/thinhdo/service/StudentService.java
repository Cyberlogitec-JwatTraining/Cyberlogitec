package com.thinhdo.service;

import java.util.List;

import com.thinhdo.entity.Student;

public interface StudentService {
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
    public List<Student> selectStudentsByName(String findName);
    public Student selectStudentByPhoneOrName(Student student);
}
