package com.fatoansw.registe.dao;

import org.apache.ibatis.annotations.Mapper;

import com.fatoansw.registe.model.User;


@Mapper
public interface UserDao {

	User selectByUserName(String userName);

	User selectById(Integer id);

	void updatePasswordById(User u);

}
