package com.prashant.noteBook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	//Return id
	List<User> findByEmail(String email);
	List<User> findByEmailAndPassword(String email, String password);
	List<User> findById(String id);
}
