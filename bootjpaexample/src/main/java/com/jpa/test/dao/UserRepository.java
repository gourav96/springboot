package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	// Custom method

	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String city);

	public List<User> findByNameStartingWith(String prefix);

	// Custom query
	
	@Query("select u from User u")
	public List<User> getAllUser();
	
	@Query("select u from User u where u.name= :n ")
	public List<User> getUserByName(@Param("n")String name);

	// native query means sql query
	
	@Query(value = "select * from User", nativeQuery = true)
	public List<User> getUser();
	
	
	
}
