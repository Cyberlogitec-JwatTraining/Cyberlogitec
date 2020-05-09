package vn.com.cyberlogitec.beanfactory.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository("stuRepository")
public class StudentRepository implements IStudentRepository {

	@Override
	public List<Student> getStudentRepository() {
		List<Student> arrListstudent = new ArrayList<Student>();
		arrListstudent.add(new Student("Do Gia Khanh", "TPHCM"));
		return arrListstudent;
	}

}
