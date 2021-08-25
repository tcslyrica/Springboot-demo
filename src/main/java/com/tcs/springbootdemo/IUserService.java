package com.tcs.springbootdemo;

public interface IUserService {

	void save(User user);
	
	Iterable<User> getAllUsers();
	Optional<User> getUser(Integer id);
}
