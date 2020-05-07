package vn.com.cyberlogitec.practice_02.AnnotationConfig.respository;

import java.util.List;

import vn.com.cyberlogitec.practice_02.AnnotationConfig.model.Employee;



public interface IRespository {
	 List<Employee> findAll();
}
