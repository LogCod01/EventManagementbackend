package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Manager;

@Service
public class ManagerDAO {
	@Autowired
ManagerRepository managerRepository;

public List<Manager> getAllManagers(){
	return managerRepository.findAll();
}
public Manager registerManager(Manager manager) {
	return managerRepository.save(manager);
}
public Manager updateManager(Manager manager) {
	return managerRepository.save(manager);
}
public void deleteManager(int managerId) {
	managerRepository.deleteById(managerId);
}
public Manager getManagerById(int managerId) {
	return managerRepository.findById(managerId).orElse(null);
}
public Manager getManagerByName(String managerName) {
	return managerRepository.findByName(managerName);
}

}