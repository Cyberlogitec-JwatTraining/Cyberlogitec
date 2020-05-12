package vn.com.cyberlogitec.practice_03.AnnotationMapper.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import vn.com.cyberlogitec.practice_03.AnnotationMapper.entity.Employee;

public interface EmployeeMapper {
	@Insert("INSERT INTO Employee (name, age) VALUES (#{name}, #{age})")
	int insert(Employee employee);
	@Update(" UPDATE Employee SET name = #{name}, age = #{age} WHERE ID = #{id}")
    int update(Employee employee);
	@Delete("DELETE from Employee WHERE ID = #{id}")
    int deleteById(int id);
	@Select("SELECT * FROM Employee")
    @Results(value = {@Result(property = "id", column = "id"), @Result(property = "name", column = "name"), @Result(property = "age", column = "age")})
    List<Employee> selectAll();
	@Select("SELECT * FROM Employee WHERE ID = #{id}")
    Employee selectById(int id);
}
