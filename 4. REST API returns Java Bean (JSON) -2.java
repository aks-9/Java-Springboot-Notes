//* 4. REST API returns Java Bean (JSON) -2

// We will create a REST end point that will return a Student Java Bean object to the client. 
// For this we need to create a new controller class.
// Select base package> right click> new > class > name it StudentController


package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	// http://localhost:8080/student
	@GetMapping("/student") // Makes this method a Rest api
	public Student getStudent() {
		return new Student("Ashish", "Singh");
	}
}

/*
 Go to the base class SpringbootFirstAppApplication, right click on it, an run as Sprint boot app.
 Go to the http://localhost:8080/student 
 
 and it should give a JSON as output:
 
 OUTPUT: 
 
 {"firstName":"Ashish","lastName":"Singh"}
 
 
 => Spring MVC internally uses the Jackson2 library and message converters, to convert Java objects into JSON.
 
 @RestController internally uses @ResponseBody, and which uses HTTP message converters to convert the return value (Java Object)
 to HTTP response body (eg: JSON), based on the content-type in the HTTP request header.
 
 This response as a JSON is returned to the client. 
 
 => By default Spring MVC uses JSON as the representation format. We can configure it to XML as well like this:
 @GetMapping("/student", produces=MediaType.APPLICATION_XML_VALUE)
 
*/
