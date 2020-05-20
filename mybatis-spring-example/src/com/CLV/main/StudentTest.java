package com.CLV.main;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.CLV.entity.Student;
import com.CLV.mapper.StudentMapper;


public class StudentTest {
    public static void main(String[] args) throws IOException {
    	Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
        SqlSession session = sqlSessionFactory.openSession();
        
        StudentMapper sMpper  = session.getMapper(StudentMapper.class);
        System.out.println("Begin Querry ! ");
        //ex1
        System.out.println("Ex1:search data base on Name ");   
        List<Student> list =sMpper.findStudentByName("Huy");
        for(Student st : list ){    	  
            System.out.println("	==>"+st.toString());
         }
        //ex2
        System.out.println("Ex2:search data base on Name or Phone");   
        Student stu = new Student();
        stu.setPhone(9792832);
        stu.setStu_name(null);
        list = sMpper.findStudentByNameorPHONE(stu);
        for(Student st : list ){    	  
            System.out.println("	==>"+st.toString());
         }
        //ex3
        System.out.println("Ex3:search data base on muti ID");  
        List<Integer> idList = new ArrayList<Integer>();
        idList.add(1);
        idList.add(2);
        list = sMpper.findStudentByMutiID(idList);
        for(Student st : list ){    	  
            System.out.println("	==>"+st.toString());
         }
        //ex4
        System.out.println("Ex4:insert muti data info (using Muti-db vendor)");  
        Student stu_ex4 = new Student();
        stu_ex4.setStu_name("ex4 student");
        stu_ex4.setBranch("ex4 branch");
        stu_ex4.setPercentage(59);
        stu_ex4.setPhone(1395445);
        stu_ex4.setEmail("ex4student@gmail.com");
        sMpper.insertStudentMutiDB(stu_ex4);
        
        list = sMpper.findStudentByName("ex4 student");
        for(Student st : list ){    	  
            System.out.println("	==>"+st.toString());
         }
        //ex5
        System.out.println("Ex5:Update data Student base on ID");  
        Student stu_ex5 = new Student();
        stu_ex5.setStu_id(2);
        stu_ex5.setStu_name("Name Ex5");
        stu_ex5.setBranch("Branch ex5");
        sMpper.updateStudentInfo(stu_ex5);
        
        list = sMpper.findStudentByName("Name Ex5");
        for(Student st : list ){    	  
            System.out.println("	==>"+st.toString());
         }
        
        System.out.println("end Querry ! ");  
	     System.out.println("Records Read Successfully ");          
	     session.commit();   
	     session.close();		
        
        
    }
}
