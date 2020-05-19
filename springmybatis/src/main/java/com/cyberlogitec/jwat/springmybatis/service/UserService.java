package com.cyberlogitec.jwat.springmybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyberlogitec.jwat.springmybatis.mapper.UserMapper;
import com.cyberlogitec.jwat.springmybatis.model.User;
@Service("userService")
public class UserService implements IUserService {
	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
	@Override
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUser();
	}
	@Override
	public User selectUserById(int userId) {
		// TODO Auto-generated method stub
		return userMapper.selectUserById(userId);
	}
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}
	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}
	@Override
	public int deleteUserById(int usertId) {
		// TODO Auto-generated method stub
		return userMapper.deleteUserById(usertId);
	}
	@Override
	public List<User> selectUserByName(String name) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByName(name);
	}
	@Override
	public List<User> selectUserByNameorAccount(User user) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByNameorAccount(user);
	}
	@Override
	public List<User> selectUserByMultiID(List<Integer> listID) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByMultiID(listID);
	}
	@Override
	public int updateUserbyID(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUserbyID(user);
	}
	

}
