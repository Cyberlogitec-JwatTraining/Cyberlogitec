package com.myself.service;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.myself.mapper.Student;
import com.myself.mapper.StudentMapperInteface;

public class Service {

	public static SqlSession setConfig(String resource) throws IOException{
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//		sqlSessionFactory.getConfiguration().addMapper(StudentMapperInteface.class);
		SqlSession session = sqlSessionFactory.openSession();
		return session;
	}
	
	public static List<Student> getAll(StudentMapperInteface studentMapperInteface){
		return studentMapperInteface.selectAllStudent();
	}
	
	public static Student getById(StudentMapperInteface studentMapperInteface, int id) {
		return studentMapperInteface.selectStudentById(id);
	}
	
	public static List<Student> getByName(StudentMapperInteface studentMapperInteface, String name){
		return studentMapperInteface.selectStudentByName(name);
	}
	
	public static List<Student> getByNameOrPhone(StudentMapperInteface studentMapperInteface, String name, int phone){
		Map<String, Object> map = new HashMap<String, Object>();
		if(!name.isEmpty()) map.put("name", name);
		else map.put("name", null);
		if(phone!=0) map.put("phone", phone);
		else map.put("phone", null);
		return studentMapperInteface.selectStudentByPhoneOrName(map);
	}
	
	public static List<Student> getByListId(StudentMapperInteface studentMapperInteface, List<Integer> list){
		return studentMapperInteface.selectManyStudentById(list);
	}
	
	public static void insert(StudentMapperInteface studentMapperInteface, Student student) {
		studentMapperInteface.insertStudent(student);
	}
	
	public static void update(StudentMapperInteface studentMapperInteface, Student student) {
		studentMapperInteface.updateStudent(student);
	}
	
	public static void deleteById(StudentMapperInteface studentMapperInteface, int id) {
		studentMapperInteface.deleteStudentById(id);
	}
	
	public static void commit(SqlSession session) {
		session.commit();
	}
	
	public static void print(List<Student> list) {
		list.forEach(System.out::println);
	}
	
	public static void print(Student student) {
		System.out.println(student);
	}
	
	public static void closeConfig(SqlSession session) {
		session.close();
	}
	
	
}
