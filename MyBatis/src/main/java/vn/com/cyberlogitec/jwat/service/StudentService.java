package vn.com.cyberlogitec.jwat.service;

import java.util.List;

import vn.com.cyberlogitec.jwat.model.Student;

public interface StudentService {
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
    public List<Student> selectStudentByName(String studentName);
    public List<Student> selectStudentByNameOrPhone(Student student);
    public List<Student> selectStudentByMultiId(int[] idList);
    public int updateStudentById(Student student);
}
