package vn.com.cyberlogitec.practice_03.XMLMapper.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import vn.com.cyberlogitec.practice_03.XMLMapper.entity.Employee;

public interface EmployeeMapper {
	int insert(Employee employee);
	int update(Employee employee);
	int deleteById(int id);
	List<Employee> selectAll();
	Employee selectById(int id);
}
