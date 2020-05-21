package com.cyberlogitec.jwat.mapper;

import java.util.List;

import com.cyberlogitec.jwat.entity.Student;

public interface StudentMapper {
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
    public Student getStudentByName(String name);
    public Student getStudentByName_Id_phone(Student student);
    public List<Student> selectMultiID(List<Integer> list);
}