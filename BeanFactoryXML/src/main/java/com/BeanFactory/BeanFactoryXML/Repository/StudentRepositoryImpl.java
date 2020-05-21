package com.BeanFactory.BeanFactoryXML.Repository;

import java.util.ArrayList;
import java.util.List;

import com.BeanFactory.BeanFactoryXML.Model.Student;

public class StudentRepositoryImpl implements StudentRepository{

	@Override
	public void addNewStd()
	{
		
		Student std = new Student();
		std.name = "NguyenVanB";
		std.phone = "0345678";
		std.address = "GiaLai";
		
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student());
		return studentList;
	}
	
	
		
		

	
}
