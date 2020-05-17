package vn.com.cyberlogitec.mybatis.mapper;
import vn.com.cyberlogitec.mybatis.model.*;


import java.util.List;


public interface CusMapper {
	final String Get_all_cus = "SELECT * FROM Customer";
	
	public List<Customer> getAllCus();
	public Customer getCusbyName(String name);
	public Customer getCusbyNameorPhone(String name, String phone);
	public List<Customer> getCusMulID(List<Integer> listID);
	public void AddCustomer(Customer customer);
	public void updateCusbyID(Customer customer);
}
