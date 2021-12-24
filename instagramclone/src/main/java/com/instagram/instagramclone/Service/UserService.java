package com.instagram.instagramclone.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.instagramclone.Entity.Users;
import com.instagram.instagramclone.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public Users submitUserData(Users user) {
		return userRepository.save(user);
//		return new Users();
	}
	
	public Users displayUserData(String userid) {
		return userRepository.findByUserId(userid);
//		return new Users();
	}
}
