package vn.com.cyberlogitec.practice_04.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import vn.com.cyberlogitec.practice_04.entity.Student;
import vn.com.cyberlogitec.practice_04.util.MyBatisUtil;

@Repository
public class StudentMapper {
	
	public List<Student> findStudentByName(String nameStudent) {
		Student student = new Student();
		student.setNAME(nameStudent);
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Student> studentList = session.selectList("findStudentByName", student);
		session.commit();
		session.close();
		return studentList;
	}
	
	public String saveStudent(Student student) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertStudent", student);
		session.commit();
		session.close();
		return "Thành Công";
	}
	
	public List<Student> findStudentByNameOrPhone(String nameStudent, String phoneStudent) {
		Student student = new Student();
		student.setNAME(nameStudent);
		student.setPHONE(phoneStudent);
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Student> studentList = session.selectList("findStudentByNameOrPhone", student);
		session.commit();
		session.close();
		return studentList;
	}
	
	public List<Student> findStudentByMultiId(List<Integer> listId) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Student> studentList = session.selectList("findStudentByMultiId", listId);
		session.commit();
		session.close();
		return studentList;
	}
	
	public Student findStudentById(int ida) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Student student = session.selectOne("findStudentById", ida);
		session.commit();
		session.close();
		return student;
	}
	
	public String updateStudent(Student student) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("updateStudent", student);
		session.commit();
		session.close();
		return "Thành Công";
	}
	
}
