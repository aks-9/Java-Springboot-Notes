//* 6. Path Variable

// We will create a REST end point that will return a List object to the client according to the path variable.

// This is StudentController file.


package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; //importing
import org.springframework.web.bind.annotation.RestController;
import java.util.List; 
import java.util.ArrayList; 

@RestController
public class StudentController {

	// http://localhost:8080/student
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
	
	// http://localhost:8080/student/Ashish/Singh
	// {} is called URI template variable. 
	// We use @PathVariable to bind the URI template variable to the method arguments.
	
	@GetMapping("/student/{firstName}/{lastName}")  // We're using two path variables here.
	public Student studentPathVarible(@PathVariable String firstName, @PathVariable String lastName) {
		return new Student(firstName, lastName);
	}
	
}

/*

Go to http://localhost:8080/student/Ashish/Singh

Output:
  
 {"firstName":"Ashish","lastName":"Singh"}
 
*/
