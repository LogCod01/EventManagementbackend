package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	@Query("from User u where u.userName = :userName")
	User findByName(@Param("userName") String userName);
	
}