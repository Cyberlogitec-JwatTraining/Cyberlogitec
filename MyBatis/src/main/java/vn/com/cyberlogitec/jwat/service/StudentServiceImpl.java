package vn.com.cyberlogitec.jwat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.cyberlogitec.jwat.mapper.StudentMapper;
import vn.com.cyberlogitec.jwat.model.Student;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
 
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }
 
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
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
	
	public List<Student> selectStudentByNameOrPhone(Student student) {
		return studentMapper.selectStudentByNameOrPhone(student);
	}

	public List<Student> selectStudentByMultiId(int[] idList) {
		return studentMapper.selectStudentByMultiId(idList);
	}

	@Override
	public int updateStudentById(Student student) {
		return studentMapper.updateStudentById(student);
	}
}