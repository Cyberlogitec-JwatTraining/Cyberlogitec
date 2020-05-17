package vn.com.cyberlogitec.mybatis.main;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vn.com.cyberlogitec.mybatis.mapper.CusMapper;
import vn.com.cyberlogitec.mybatis.model.Customer;

public class MainApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
 
        CusMapper cusMapper = session.getMapper(CusMapper.class);
//
//        List<Integer> listID = new ArrayList<Integer>();
//        listID.add(1);listID.add(2);listID.add(3);listID.add(4);
//        List<Customer> listCus = cusMapper.getCusMulID(listID);
        
        
//        Customer newcus = new Customer();
//        newcus.setFname("Van B");
//        newcus.setUsername("helloworld123");
//        newcus.setPass("5678");
//        newcus.setAvatar("");
//        newcus.setStt(true);
//        newcus.setSex("1");
//        newcus.setPhone("123456789");
//        newcus.setEmail("VanB@gmail.com");
//        newcus.setAddr("Bac Ninh");
//        newcus.setId(1);
//        cusMapper.updateCusbyID(newcus);
        
        
//        cusMapper.AddCustomer(newcus);
//        session.commit();
//        Customer listCus = cusMapper.getCusbyNameorPhone("Van B", "123456789");
        List<Customer> listCus = cusMapper.getAllCus();

        	System.out.print(listCus);
        
        
        session.close();
	}

}
