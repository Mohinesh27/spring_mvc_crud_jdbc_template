package com.mohinesht.springcrud.dao;

import com.mohinesht.springcrud.model.Login;
import com.mohinesht.springcrud.model.User;

public interface UserDao {
	  void register(User user);
	  User validateUser(Login login);
	}