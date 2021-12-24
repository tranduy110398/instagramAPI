package com.instagram.instagramclone.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.instagram.instagramclone.Entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
	
	Users save(Users user);
	
	Users findByUserId(String userid);
	
}
