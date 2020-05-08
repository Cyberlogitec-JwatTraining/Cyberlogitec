package vn.com.cyberlogitec.BeanFactory;

import java.util.ArrayList;

public interface StudentRepository {
	void addNewStudent(String name, String id);
	ArrayList<Student> getListStudent();
}
