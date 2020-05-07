package vn.com.cyberlogitec.practice_02.AnnotationConfig.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.com.cyberlogitec.practice_02.AnnotationConfig.model.Employee;



@Repository("employeeRespository")
public class EmployeeRespository implements IRespository {

	@Override
	public List<Employee> findAll() {
		List<Employee> liststd = new ArrayList<Employee>();
		liststd.add(new Employee("Huynh Minh Tri", "27"));
		return liststd;
	}

	

		
}
