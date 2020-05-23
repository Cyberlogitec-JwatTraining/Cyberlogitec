package vn.com.cyberlogitec.jwat.service;

import vn.com.cyberlogitec.jwat.entity.User;

public interface UserService {
	public int insertUser(User user);
//    public int updateStudent(Student student);
//    public int deleteStudentById(int studentId);
//    public List<Student> selectAllStudent();
    public User selectUserById(int userId);
}
