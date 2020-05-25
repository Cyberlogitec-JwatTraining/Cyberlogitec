package vn.com.cyberlogitec.practice_04;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import vn.com.cyberlogitec.practice_04.dao.StudentMapper;
import vn.com.cyberlogitec.practice_04.entity.Student;

public class MainTest {

	public static void main(String[] args) {
		StudentMapper studentMapper = new StudentMapper();

		// Find All

		/*
		 * List<Student> student = studentMapper.findAll();
		 * System.out.println(student.toString());
		 */

		// Search Student by Name

		/*
		 * String nameStudent = "B"; if (nameStudent.equals("")) { nameStudent = null; }
		 * List<Student> student = studentMapper.findStudentByName(nameStudent);
		 * System.out.println(student.toString());
		 */

		// Search Student by Name Or Phone

		/*
		 * String nameStudent = ""; String phoneStudent = "90358"; if
		 * (nameStudent.equals("")) { nameStudent = null; } else if
		 * (phoneStudent.equals("")) { phoneStudent = null; } List<Student> student =
		 * studentMapper.findStudentByNameOrPhone(nameStudent, phoneStudent);
		 * System.out.println(student.toString());
		 */
		// Search Student by Multi Id

		/*
		 * List<Integer> listId = new ArrayList<Integer>(); listId.add(7);
		 * listId.add(8); listId.add(9); List<Student> student =
		 * studentMapper.findStudentByMultiId(listId); if (student.isEmpty()) {
		 * System.out.println("Không có KQ"); } else {
		 * System.out.println(student.toString()); }
		 */

		// Update Student by ID

		/*
		 * int ida = 7; Student student = studentMapper.findStudentById(ida); if
		 * (student != null) { student.setEMAIL("abc@adwwad");
		 * student.setBRANCH("zxcv"); String result =
		 * studentMapper.updateStudent(student); System.out.println(result);
		 * System.out.println(student.toString()); } else {
		 * System.out.println("Thất bại"); }
		 */

		// Insert Student

		/*
		 * Student student = new Student("Huynh Minh Tri", "bcd", 100, "0359941234",
		 * "abc@abc"); String result = studentMapper.saveStudent(student);
		 * System.out.println(result);
		 */

	}

}
