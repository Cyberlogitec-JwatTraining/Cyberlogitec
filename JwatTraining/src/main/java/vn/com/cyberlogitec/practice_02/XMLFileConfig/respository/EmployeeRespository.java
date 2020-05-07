package vn.com.cyberlogitec.practice_02.XMLFileConfig.respository;

import java.util.ArrayList;
import java.util.List;

import vn.com.cyberlogitec.practice_02.XMLFileConfig.model.Employee;

public class EmployeeRespository implements IRespository {

	@Override
	public List<Employee> findAll() {
		List<Employee> liststd = new ArrayList<Employee>();
		liststd.add(new Employee("Huynh Minh Tri", "27"));
		return liststd;
	}

	

		
}
