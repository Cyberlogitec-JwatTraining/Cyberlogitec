package vn.com.cyberlogitec.jwat.service;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.cyberlogitec.jwat.entity.User;
import vn.com.cyberlogitec.jwat.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
// 
//    public int updateStudent(Student student) {
//        return studentMapper.updateStudent(student);
//    }
// 
//    public int deleteStudentById(int studentId) {
//        return studentMapper.deleteStudentById(studentId);
//    }
// 
//    public List<Student> selectAllStudent() {
//        return studentMapper.selectAllStudent();
//    }
 
	public User selectUserById(int userId) {
        return userMapper.selectUserById(userId);
    }
}
