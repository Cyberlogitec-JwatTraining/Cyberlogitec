package com.BeanFactory.BeanFactoryXML.Repository;

import java.util.List;

import com.BeanFactory.BeanFactoryXML.Model.Student;



public interface StudentRepository {

	public void addNewStd();
	
	List<Student> getAllStudent();
}
