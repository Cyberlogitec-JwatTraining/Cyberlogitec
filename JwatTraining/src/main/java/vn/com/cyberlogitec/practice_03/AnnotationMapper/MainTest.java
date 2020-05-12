package vn.com.cyberlogitec.practice_03.AnnotationMapper;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vn.com.cyberlogitec.practice_03.AnnotationMapper.entity.Employee;
import vn.com.cyberlogitec.practice_03.AnnotationMapper.mapper.EmployeeMapper;



public class MainTest {

	public static void main(String[] args) {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("SqlMapAnnotationConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = sqlSessionFactory.openSession();

			// create employee mapper
			EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

			// show list employee
			List<Employee> listEmployees = employeeMapper.selectAll();
			for (Employee employees : listEmployees) {
				System.out.println(employees.toString());
			}

			
			/*
			 * // get employee by Id Employee employee = employeeMapper.selectById(2);
			 * System.out.println(employee);
			 */
			 

			/*
			 * // insert employee Employee employee = new Employee("Jim", 23);
			 * employeeMapper.insert(employee); session.commit();
			 */

			/*
			 * // update employee Employee employee = employeeMapper.selectById(2);
			 * employee.setName("Jim Smith"); employee.setAge(12399888);
			 * employeeMapper.update(employee); session.commit();
			 */

			/*
			 * // delete employee employeeMapper.deleteById(2); session.commit();
			 */

			// close session
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
