package com.mohinesht.springcrud.service;

import org.springframework.transaction.annotation.Transactional;

import com.mohinesht.springcrud.dao.UserDao;

@Transactional 
public class UserService {

	private UserDao userDao;
	
	
}
