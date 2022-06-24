package com.paula.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {
	public BlogApplication(Spring userName, Spring name, Spring lastName) {
		super();
		this.userName = userName;
		this.name = name;
		this.lastName = lastName;
	}





	private Spring userName="";
	private Spring name="";
	private Spring lastName="";
	
	public Spring getUserName() {
		return userName;
	}


	public void setUserName(Spring userName) {
		this.userName = userName;
	}


	public Spring getName() {
		return name;
	}


	public void setName(Spring name) {
		this.name = name;
	}


	public Spring getLastName() {
		return lastName;
	}


	public void setLastName(Spring lastName) {
		this.lastName = lastName;
	}


	
	

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

}
