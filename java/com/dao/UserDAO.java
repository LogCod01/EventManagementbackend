package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.User;

@Service
public class UserDAO {

	@Autowired
	UserRepository userRepository;
//	PasswordProtection(char[] password, String protectionAlgorithm, AlgorithmParameterSpec protectionParameters)
	public UserDAO(UserRepository userRepository){
//		this.userRepository = userRepository;
//		this.passwordEncoder = new BcryptPasswordEncoder();
	}
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	public User registerUser(User user) {
		return userRepository.save(user);
	}
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	public void deleteUser(int userId) {
		userRepository.deleteById(userId);
	}
	public User getUserById(int userId) {
		return userRepository.findById(userId).orElse(null);
	}
	public User getUserByName(String userName) {
		return userRepository.findByName(userName);
	}
	public User registerUserHC(User user) {
		return userRepository.save(user);
	}
}