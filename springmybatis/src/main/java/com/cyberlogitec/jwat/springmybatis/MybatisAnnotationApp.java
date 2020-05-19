package com.cyberlogitec.jwat.springmybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.cyberlogitec.jwat.springmybatis.mapper.UserMapperUsingAnnotation;
import com.cyberlogitec.jwat.springmybatis.model.User;

public class MybatisAnnotationApp {
	public static void main(String[] args) throws IOException  {
		//Using Annotation
		Reader reader = Resources.getResourceAsReader("SqlMapConfigAnnotation.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	    SqlSession session = sqlSessionFactory.openSession();
	    
	    UserMapperUsingAnnotation userMapper = session.getMapper(UserMapperUsingAnnotation.class);
	    List<User> listUser = userMapper.selectAllUser();
	    for(User user: listUser) {
	    	System.out.println(user);
	    }
	    
	    User user1 = userMapper.selectUserById(5);
	    System.out.println(user1);
	    user1.setName("admin0101");
	    user1.setAccount("admin0101@gmail.com");
	    userMapper.updateUser(user1);
	    System.out.println(user1);
	    
	    //session.commit();
	    session.close();
	       
	}
}
