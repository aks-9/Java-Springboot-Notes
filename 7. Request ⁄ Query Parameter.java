//* 7. Request / Query Parameter

// // We will create a REST end point that will handle a request parameter in the web request URI.

// This is StudentController file.


package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestParam; //importing
import org.springframework.web.bind.annotation.RestController;
import java.util.List; 
import java.util.ArrayList; 

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Ashish", "Singh");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Ashish", "Singh"));
		students.add(new Student("Prince", "Chaudhary"));
		students.add(new Student("Agent", "Smith"));
		students.add(new Student("Neo", "Anderson"));
		students.add(new Student("Harvey", "Spector"));
		
		return students; 
		
	}
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVarible(@PathVariable String firstName, @PathVariable String lastName) {
		return new Student(firstName, lastName);
	}
	
	//* Build rest API to handle query parameters
	// @RequestParam is used to bind the web request parameter to the method arguments.
	// http://localhost:8080/student/query?firstName=Ashish&lastName=Singh
	
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam String firstName, @RequestParam String lastName) {
		return new Student(firstName, lastName);
	}
	
	
}

/*

http://localhost:8080/student/query?firstName=Ashish&lastName=Singh

Output:
  
{"firstName":"Ashish","lastName":"Singh"}
 
*/
