package com.instagram.instagramclone.Entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Post")
public class Post {
	
	@Id
	@GeneratedValue
	private int Id;
	
	private String postId;
	private String userId;
	private String postPath;
	private Timestamp timeStamp;
	private String userName;
	private int likesAmount;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(int id, String postId, String userId, String postPath, Timestamp timeStamp, int likesAmount) {
		super();
		Id = id;
		this.postId = postId;
		this.userId = userId;
		this.postPath = postPath;
		this.timeStamp = timeStamp;
		this.likesAmount = likesAmount;
	}
	
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPostPath() {
		return postPath;
	}

	public void setPostPath(String postPath) {
		this.postPath = postPath;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getLikesAmount() {
		return likesAmount;
	}

	public void setLikesAmount(int likesAmount) {
		this.likesAmount = likesAmount;
	}
	
	
	
	
}
