package com.Mybatics.Service;

import java.util.List;




import com.Mybatics.Mapper.StudentMapper;
import com.Mybatics.Model.Student;

public interface StudentService {

	public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
    
	List<Student> selectStudentByName(StudentMapper studentMapper, String name);
	List<Student> selectStudentByNameOrPhone(StudentMapper studentMapper, String name, int phone);
	List<Student> selectStudentByListId(StudentMapper studentMapper, List<Integer> list);
	
	
	
	
	
}
