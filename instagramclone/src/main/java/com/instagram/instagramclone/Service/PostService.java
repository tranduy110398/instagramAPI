package com.instagram.instagramclone.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.instagramclone.Entity.Post;
import com.instagram.instagramclone.Repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	UserService userService;
		
	public Post submitPostData(Post post) {
		return postRepository.save(post);
	}
	
	public ArrayList<Post> displayPostData(){
		ArrayList<Post> postList = postRepository.findAll();
		for (int i = 0 ; i < postList.size();i++) {
			Post specificPost = postList.get(i);
			specificPost.setUserName(userService.displayUserData(specificPost.getUserId()).getUserName());
		}
		
		return postList;
	}
}
