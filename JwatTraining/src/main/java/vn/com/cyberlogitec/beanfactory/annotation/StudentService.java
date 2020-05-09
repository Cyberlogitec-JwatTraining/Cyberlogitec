package vn.com.cyberlogitec.beanfactory.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("stuService")
public class StudentService implements IStudentService {
	@Autowired
	private IStudentRepository studentRepository;
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepository.getStudentRepository();
	}

}
