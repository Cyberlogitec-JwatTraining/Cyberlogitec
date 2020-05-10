package vn.com.cyberlogitec.practice_test2.ex1;

import java.util.List;

public class ServiceImp implements Service{
	private Repository studentRepo;
	
	
	public ServiceImp() {
		
		
	}
	public ServiceImp(Repository studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}
	
	public void excuteAddStudent(Student s) {
		this.studentRepo.addNewStudent(s);
	}
	
	public List<Student> getStudents(){
		return this.studentRepo.getStudentList();
	}
}
