package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDAO;
import com.dto.User;

@RestController
public class UserController {

	@Autowired
	UserDAO userDAO;
	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userDAO.getAllUsers();
	}
	
	@RequestMapping("/registerUserHC")
	public String registerUserHC() {
		
		User user1 = new User("sandy","sandy@gmail.com","9876556789","12345");
		User user2 = new User("Mani","mani@gmail.com","9553618725","Mani123");
		User user3 = new User("arun","arun@gmail.com","7897897899","12345");
		
		userDAO.registerUser(user1);
		userDAO.registerUser(user2);
		userDAO.registerUser(user3);
		
		return "All 3 Employees Registered Successfully";
	}
//	@PostMapping("/registerUser")
//	public String registerUser(@RequestBody User user) {
//		 userDAO.registerUser(user);
//		return "yes";
//	}
	@PostMapping("/registerUser")
	public String registerUser(@RequestBody User user) {
		userDAO.registerUser(user);
		return "User Registered Successfully";
	}

	@PutMapping("/updateUser")
	public String updateUser(@RequestBody User user) {
		userDAO.updateUser(user);
		return "user Updated Successfully";
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public String deleteUserID(@PathVariable("userId") int userId) {
		userDAO.deleteUser(userId);
		return "User with " + userId + ", Deleted Successfully!!!";
	}
}