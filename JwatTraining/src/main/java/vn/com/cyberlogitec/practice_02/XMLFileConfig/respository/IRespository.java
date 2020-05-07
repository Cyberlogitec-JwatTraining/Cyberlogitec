package vn.com.cyberlogitec.practice_02.XMLFileConfig.respository;

import java.util.List;

import vn.com.cyberlogitec.practice_02.XMLFileConfig.model.Employee;

public interface IRespository {
	 List<Employee> findAll();
}
