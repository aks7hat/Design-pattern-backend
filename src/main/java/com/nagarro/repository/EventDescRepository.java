package com.nagarro.repository;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nagarro.Model.Event;
import com.nagarro.Model.EventDescription;


public interface EventDescRepository extends JpaRepository <EventDescription,Integer>{
	
	

	@Transactional
   
	@Query(value="select description from event_description e where e.date=:date",nativeQuery = true)
    public List<String> getDescription(String date);
	
	@Transactional
	@Query(value="select event_type from event_description e where e.date=:date",nativeQuery = true)
    public List<String> geteventType(String date);

	public List<Event> findByEventId(@Valid int id);

	
	@Transactional
	@Query(value="select user_id from event_description e where e.date=:currentDate",nativeQuery = true)
	public List<Integer> getUserId(String currentDate);

	
//	@Transactional
//	  
//	@Query(value="select user_id from event_description e where e.user_id=:id",nativeQuery = true)
//	public List<Integer> getUserId(int id);
//	
	


	

}
