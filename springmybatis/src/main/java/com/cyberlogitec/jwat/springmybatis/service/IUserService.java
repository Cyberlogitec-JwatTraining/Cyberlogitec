package com.cyberlogitec.jwat.springmybatis.service;

import java.util.List;

import com.cyberlogitec.jwat.springmybatis.model.User;


public interface IUserService {
	public List<User> selectAllUser();
	public User selectUserById(int userId);
	public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUserById(int usertId);
  //-------------------------------------------
    public List<User> selectUserByName(String name);
    public List<User> selectUserByNameorAccount(User user);
    public List<User> selectUserByMultiID(List<Integer> listID);
    public int updateUserbyID(User user);
}
