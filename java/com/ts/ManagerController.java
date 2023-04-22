package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ManagerDAO;
import com.dto.Manager;

@RestController
public class ManagerController {

	@Autowired
	ManagerDAO managerDAO;
	@RequestMapping("/getAllManagers")
	public List<Manager> getAllManagers(){
		return managerDAO.getAllManagers();
	}
	@PostMapping("/registerManager")
	public String registerManager(@RequestBody Manager manager){
		managerDAO.registerManager(manager);
		return "manager Registered Successfully";
	}
}