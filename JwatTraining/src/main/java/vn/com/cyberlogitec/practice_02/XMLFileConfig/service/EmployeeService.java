package vn.com.cyberlogitec.practice_02.XMLFileConfig.service;

import java.util.List;

import vn.com.cyberlogitec.practice_02.XMLFileConfig.model.Employee;
import vn.com.cyberlogitec.practice_02.XMLFileConfig.respository.IRespository;

public class EmployeeService implements IService {
	private IRespository employeeRepository;
	public EmployeeService() {
		System.out.println("Default Constructer");
	}
	
	public EmployeeService(IRespository employeeRepository) {
		System.out.println("Constructer with Paramerter");
		this.employeeRepository = employeeRepository;
	}
	
	public void setEmployeeRepository(IRespository employeeRepository) {
		System.out.println("Setter with Paramerter");
		this.employeeRepository = employeeRepository;
	}
	
	public IRespository getEmployeeRepository() {
		return this.employeeRepository;
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
}
