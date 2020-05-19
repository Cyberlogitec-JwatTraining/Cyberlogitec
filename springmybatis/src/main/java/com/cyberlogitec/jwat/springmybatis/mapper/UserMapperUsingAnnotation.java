package com.cyberlogitec.jwat.springmybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import com.cyberlogitec.jwat.springmybatis.model.User;

public interface UserMapperUsingAnnotation {
	@Select("SELECT * FROM USER")
	@Results(value = { @Result(property = "id", column = "USERID"),
            @Result(property = "name", column = "USERNAME"),
            @Result(property = "sex", column = "SEX"),
            @Result(property = "account", column = "ACCOUNTNAME"),
            @Result(property = "password", column = "PASSWORD"),
            @Result(property = "userLevel", column = "USERLEVEL") })
	public List<User> selectAllUser();
	
	@Select("SELECT * FROM USER WHERE USERID = #{id}")
	public User selectUserById(int userId);
	
	@Insert("INSERT INTO USER (USERID, USERNAME, SEX, ACCOUNTNAME, PASSWORD, USERLEVEL ) VALUES (#{id}, #{name}, #{sex}, #{account}, #{password}, #{userLevel})")
	public int insertUser(User user);
	
	@Update("UPDATE USER SET USERNAME = #{name}, SEX = #{sex}, ACCOUNTNAME = #{account}, PASSWORD = #{password}, USERLEVEL = #{userLevel} WHERE USERID = #{id}")
    public int updateUser(User user);
	
	@Delete("DELETE from USER WHERE USERID = #{id};")
    public int deleteUserById(int usertId);
	
}
