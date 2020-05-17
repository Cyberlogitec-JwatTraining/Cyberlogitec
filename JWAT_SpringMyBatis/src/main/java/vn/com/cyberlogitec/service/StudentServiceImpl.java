package vn.com.cyberlogitec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.cyberlogitec.mapper.StudentMapper;
import vn.com.cyberlogitec.model.Student;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
 
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }
 
    public int updateStudentById(Student student) {
        return studentMapper.updateStudentById(student);
    }
 
    public int deleteStudentById(int studentId) {
        return studentMapper.deleteStudentById(studentId);
    }
 
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }
 
    public Student selectStudentById(int studentId) {
        return studentMapper.selectStudentById(studentId);
    }
    
    public List<Student> selectStudentByName(String studentName) {
        return studentMapper.selectStudentByName(studentName);
    }
    
    public List<Student> selectStudentByOption(Student student){
    	return studentMapper.selectStudentByOption(student);
    }
    
    public List<Student> selectMultipleStudentByIds(int[] idList){
    	return studentMapper.selectMultipleStudentByIds(idList);
    }
}