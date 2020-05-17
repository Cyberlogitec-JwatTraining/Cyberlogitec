package vn.com.cyberlogitec.practice_04;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import vn.com.cyberlogitec.practice_04.dao.StudentMapper;
import vn.com.cyberlogitec.practice_04.entity.Student;

public class MainTest {

	public static void main(String[] args) {
		StudentMapper studentMapper = new StudentMapper();

		// Search Student by Name
		/*
		 * String nameStudent = ""; if (nameStudent.equals("")) { nameStudent = null; }
		 * List<Student> student = studentMapper.findStudentByName(nameStudent);
		 */

		// Search Student by Name Or Phone
		/*
		 * String nameStudent = ""; String phoneStudent = ""; if
		 * (nameStudent.equals("")) { nameStudent = null; } else if
		 * (phoneStudent.equals("")) { phoneStudent = null; } List<Student> student =
		 * studentMapper.findStudentByNameOrPhone(nameStudent, phoneStudent);
		 */
		
		//Search Student by Multi Id
		
		/*
		 * List<Integer> listId = new ArrayList<Integer>(); List<Student> student =
		 * studentMapper.findStudentByMultiId(listId);
		 * System.out.println(student.toString());
		 */
		
		//Update Student by ID
		
		/*
		 * int ida = 0; Student student = studentMapper.findStudentById(ida); if
		 * (student != null) { student.setEMAIL("abc@adwwad");
		 * student.setBRANCH("zxcv"); String result =
		 * studentMapper.updateStudent(student); System.out.println(result); }else {
		 * System.out.println("Thất bại"); }
		 */
		
		//Insert Student
		
		Student student = new Student("Huynh Minh Tri", "bcd", 100, "0359941234", "abc@abc");
		String result = studentMapper.saveStudent(student);
		System.out.println(result);
	}

}
