package com.myself.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.myself.mapper.Student;
import com.myself.mapper.StudentMapperInteface;
import com.myself.service.Service;

public class Main {

	public static void main(String[] args) throws IOException{
		
		SqlSession session = Service.setConfig("SqlMapConfig.xml");
		
		StudentMapperInteface studentMapperInteface = session.getMapper(StudentMapperInteface.class);
		
////		Get all student
//		List<Student> list = Service.getAll(studentMapperInteface);
//		Service.print(list);
//		
////		Get student by id
//		Student student = Service.getById(studentMapperInteface, 1);
//		Service.print(student);
//		
////		Get student by name
//		List<Student> listByName = Service.getByName(studentMapperInteface, "");
//		Service.print(listByName);
//		
////		Get student by name or phone
//		Service.print(Service.getByNameOrPhone(studentMapperInteface, "Do Gia Khanh", 0));
//		Service.print(Service.getByNameOrPhone(studentMapperInteface, "", 2));
//		Service.print(Service.getByNameOrPhone(studentMapperInteface, "Tran Thanh Quang", 2));
//		Service.print(Service.getByNameOrPhone(studentMapperInteface, "", 0));
//		
////		Get student by list id
//		List<Integer> listId = new ArrayList<Integer>();
//		listId.add(3);
//		listId.add(2);
//		Service.print(Service.getByListId(studentMapperInteface, listId));
//		
////		Update student using set
//		Student updateStudent = Service.getById(studentMapperInteface, 1);
//		updateStudent.setEmail("bqkhai@outlook.com");
//		Service.update(studentMapperInteface, updateStudent);
//		Service.commit(session);
//		Service.print(Service.getAll(studentMapperInteface));
		
//		Insert new student
//		Service.insert(studentMapperInteface, new Student(0, "Le Hong Phong", "Quan 1", 2000000, 3, "hongphongle@outlook.com"));
//		Service.commit(session);
		Service.print(Service.getAll(studentMapperInteface));
		
//		Close session
		Service.closeConfig(session);
	}	
}
