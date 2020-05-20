package com.CLV.mapper;

import java.util.List;

import com.CLV.entity.Student;

public interface StudentMapper {
	

	List<Student> findAllStudent();
	
	List<Student> findStudentByName(String name);
    
    List<Student> findStudentByNameorPHONE(Student student);
    
    List<Student> findStudentByMutiID(List<Integer> slist);
    
    void insertStudentMutiDB(Student student);
    
    void updateStudentInfo(Student student);
}
