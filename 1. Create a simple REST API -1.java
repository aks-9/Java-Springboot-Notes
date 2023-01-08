//* 1. Create a simple REST API -1

//* This is SpringbootFirstAppApplication.java file

/*
In the base package, right click > New > class. Name the class with 'Controller' suffix.


 */

package com.springboot.first.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
	}

}
