package com.Mybatics.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mybatics.Mapper.StudentMapper;
import com.Mybatics.Model.Student;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService{
	 @Autowired
	 StudentMapper studentMapper;

	 @Override
	 public int insertStudent(Student student) {
	        return studentMapper.insertStudent(student);
	 }

	 @Override
	 public int updateStudent(Student student) {
	        return studentMapper.updateStudent(student);
	 }

	 @Override
	 public int deleteStudentById(int studentId) {
	        return studentMapper.deleteStudentById(studentId);
	 }

	 @Override
	 public List<Student> selectAllStudent() {
	        return studentMapper.selectAllStudent();
	 }

	 @Override
	 public Student selectStudentById(int studentId) {
	        return studentMapper.selectStudentById(studentId);
	 }
	

	
	
	
	
	@Override
	public List<Student> getStudentByName(StudentMapper studentMapper, String name){
		return studentMapper.selectStudentByName(name);
	}
	
	@Override
	public List<Student> getStudentByNameOrPhone(StudentMapper studentMapper, String name, int phone){
		Map<String, Object> map = new HashMap<String, Object>();
		if(!name.isEmpty()) map.put("name", name);
		else map.put("name", null);
		if(phone!=0) map.put("phone", phone);
		else map.put("phone", null);
		return studentMapper.selectStudentByPhoneOrName(map);
	}
	
	@Override
	public List<Student> getStudentByListId(StudentMapper studentMapper, List<Integer> list){
		return studentMapper.selectManyStudentById(list);
	}
	
	
	
	
	
	
	
}
