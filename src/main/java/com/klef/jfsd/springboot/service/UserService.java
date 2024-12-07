package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.User;

public interface UserService {
	public String addUser(User user);
	public String updateUser(User user);
	public String deleteUser(int uid);
	public List<User> displayAllUsers();
	public User displayById(int uid);
    public User findByEmail(String email);
}
