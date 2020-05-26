package com.nagarro.repository;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nagarro.Model.Event;



@Repository
public interface EventRepository extends JpaRepository<Event, Integer>{

	

//	@Transactional
//    @Modifying
//	@Query(value="select event_id from events e where e.user_id=:id",nativeQuery = true)
//    public List<int> void getId(@Valid int id);

	List<Event> findByEventId(@Valid int id);

	@Transactional
	@Query(value="select celebration from events e where e.user_id=:userId",nativeQuery = true)
	boolean getCelebration(int userId);
	
	
	@Transactional 
	@Query(value="select holiday from events e where e.user_id=:userId",nativeQuery = true)
	boolean getholiday(int userId);
	
	
	@Transactional  
	@Query(value="select new_policy from events e where e.user_id=:userId",nativeQuery = true)
	boolean getnewPolicy(int userId);
	
	
	@Transactional  
	@Query(value="select news from events e where e.user_id=:userId",nativeQuery = true)
	boolean getNews(int userId);
	
	

	@Transactional 
	@Query(value="select urgent_help from events e where e.user_id=:userId",nativeQuery = true)
	boolean getUrgentHelp(int userId);
	
	
	

	

	

}
