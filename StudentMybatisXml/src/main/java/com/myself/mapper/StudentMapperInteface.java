package com.myself.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface StudentMapperInteface {
	
	List<Student> selectAllStudent();
	List<Student> selectStudentByName(@Param("name") String name);
	List<Student> selectStudentByPhoneOrName(Map<String, Object> map);
	List<Student> selectManyStudentById(List<Integer> list);
	Student selectStudentById(@Param("id") int id);
	void insertStudent(Student student);
	void updateStudent(Student student);
	void deleteStudentById(@Param("id") int id);
}
