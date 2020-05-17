package vn.com.cyberlogitec.mapper;

import java.util.List;

import vn.com.cyberlogitec.model.Student;

public interface StudentMapper {
	public int insertStudent(Student student);
    public int updateStudentById(Student student);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
    public List<Student> selectStudentByName(String studentName);
    public List<Student> selectStudentByOption(Student student);
    public List<Student> selectMultipleStudentByIds(int[] idList);
}
