package com.thinhdo.mapper;

import java.util.List;

import com.thinhdo.entity.Student;

public interface StudentMapper {
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
    public List<Student> selectStudentsByName(String findName);
    public List<Student> selectStudentByPhoneOrName(Student student);
    public List<Student> selectStudentByIds(List<Integer> listIDs);
}
