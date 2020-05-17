package com.thinhdo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinhdo.entity.Student;
import com.thinhdo.mapper.StudentMapper;

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

	public List<Student> selectStudentsByName(String findName) {
		return studentMapper.selectStudentsByName(findName.trim());
	}

	public List<Student> selectStudentByPhoneOrName(Student student) {
		return studentMapper.selectStudentByPhoneOrName(student);
	}

	public List<Student> selectStudentByIds(List<Integer> listIDs) {
		return studentMapper.selectStudentByIds(listIDs);
	}
}
