package vn.com.cyberlogitec.BeanFactory;

import java.util.ArrayList;

public interface StudentService {
	void addNewStudent(String name, String id);
	ArrayList<Student> getListStudent();
}
