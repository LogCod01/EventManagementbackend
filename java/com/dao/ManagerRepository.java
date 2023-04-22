package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dto.Manager;
@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {
	@Query("from Manager m where m.managerName = :managerName")
	Manager findByName(@Param("managerName") String managerName);

}