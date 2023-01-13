//* 5. REST API returns a List

// We will create a REST end point that will return a List object to the client. 

// This is StudentController file.


package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List; //importing
import java.util.ArrayList; //importing

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
		
		return students; // returns a list of students
		// This REST API will return an array of JSON objects.
		
	}
}

/*

Run the spring boot app and go to http://localhost:8080/students
  
Output:
  
  [{"firstName":"Ashish","lastName":"Singh"},{"firstName":"Prince","lastName":"Chaudhary"},{"firstName":"Agent","lastName":"Smith"},{"firstName":"Neo","lastName":"Anderson"},{"firstName":"Harvey","lastName":"Spector"}]
  
 
 
*/
