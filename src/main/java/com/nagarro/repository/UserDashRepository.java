package com.nagarro.repository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.Model.UserDashboard;

public interface UserDashRepository extends JpaRepository<UserDashboard , Integer>{

	List<UserDashboard> findByUserId(@Valid int id);

}
