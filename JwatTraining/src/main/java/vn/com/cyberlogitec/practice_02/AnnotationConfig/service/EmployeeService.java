package vn.com.cyberlogitec.practice_02.AnnotationConfig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.cyberlogitec.practice_02.AnnotationConfig.model.Employee;
import vn.com.cyberlogitec.practice_02.AnnotationConfig.respository.IRespository;



@Service("employeeService")
public class EmployeeService implements IService {
	
	@Autowired
	private IRespository employeeRepository;
	
	public EmployeeService() {
		System.out.println("Default Constructer");
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
}
