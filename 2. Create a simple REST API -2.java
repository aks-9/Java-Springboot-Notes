//* 2. Create a simple REST API -2

//* This is HelloWorldController.java file

package com.springboot.first.app;

//import org.springframework.stereotype.Controller; //imported
//import org.springframework.web.bind.annotation.ResponseBody; //imported
import org.springframework.web.bind.annotation.RestController; // Use this instead of above two
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
//@ResponseBody
@RestController // Makes this class a REST API, it can handle the web requests.
public class HelloWorldController {
	// Get
	// Post
	// Update
	// Delete
	
	@GetMapping("hello-world") // Allows to serve this method as a REST API at http://localhost:8080
	public String helloWorld() {
		return "Helloooooooooo";
	}
	
	
	// Run the Spring boot application by right clicking on the base package start class and run as a spring boot app.
	
	
	

}
