package com.Mybatics.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.Mybatics.Model.Student;



public interface StudentMapper {
	public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);


	List<Student> selectStudentByName(@Param("name") String name);
	List<Student> selectStudentByPhoneOrName(Map<String, Object> map);
	List<Student> selectManyStudentById(List<Integer> list);
	
	
}
