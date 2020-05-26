package com.nagarro.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nagarro.Model.Registration;
@Repository
public interface RegRepository  extends JpaRepository<Registration, Integer>{

	Registration findByEmail(String email);
	
	
	@Transactional
	@Query(value="select user_id from registration r where r.email=:email",nativeQuery = true)
	int getuserId(String email);

}
