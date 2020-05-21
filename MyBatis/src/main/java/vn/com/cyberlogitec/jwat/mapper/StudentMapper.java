package vn.com.cyberlogitec.jwat.mapper;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Student;

public interface StudentMapper {
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
    public List<Student> selectStudentByName(String studentName);
}