package com.tcs.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository userRepository;
	
	@Override
	public void save(User user) {
		System.out.println("saved");
	}
	
	@Override
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public Optional<User> getUser(Integer id) {
		Optional<User> user = userRepository.findById(id);
		if (!user.isPresent()) {
			throw new UserNotFoundException("user does not exist");
		}
		return user;
	}
	
	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
}
