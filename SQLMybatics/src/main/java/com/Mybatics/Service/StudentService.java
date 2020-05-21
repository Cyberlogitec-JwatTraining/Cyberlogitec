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
    
	List<Student> getStudentByName(StudentMapper studentMapper, String name);
	List<Student> getStudentByNameOrPhone(StudentMapper studentMapper, String name, int phone);
	List<Student> getStudentByListId(StudentMapper studentMapper, List<Integer> list);
	
	
	
	
	
}
