package com.bookstore.model;

public class Interest {
	
	private int id;
	private String likes;
	private String dislikes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLikes() {
		return likes;
	}
	public void setLikes(String likes) {
		this.likes = likes;
	}
	public String getDislikes() {
		return dislikes;
	}
	public void setDislikes(String dislikes) {
		this.dislikes = dislikes;
	}
	@Override
	public String toString() {
		return "Interest [id=" + id + ", likes=" + likes + ", dislikes=" + dislikes + "]";
	}

}
