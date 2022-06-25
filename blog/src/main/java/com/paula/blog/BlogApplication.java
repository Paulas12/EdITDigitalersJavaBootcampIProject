package com.paula.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

	private Spring userName="";
	private Spring name="";
	private Spring lastName="";
	
	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

}
