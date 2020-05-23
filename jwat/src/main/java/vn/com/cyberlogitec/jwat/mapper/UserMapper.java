package vn.com.cyberlogitec.jwat.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import vn.com.cyberlogitec.jwat.entity.User;

public interface UserMapper {
	public int insertUser(User user);
//    public int updateStudent(Student student);
//    public int deleteStudentById(int studentId);
//    public List<Student> selectAllStudent();
    public User selectUserById(int userId);
}
