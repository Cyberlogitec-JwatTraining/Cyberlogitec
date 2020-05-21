package com.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Model.Student;

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {
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
