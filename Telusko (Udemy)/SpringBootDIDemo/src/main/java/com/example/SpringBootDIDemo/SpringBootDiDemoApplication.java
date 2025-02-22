package com.example.SpringBootDIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDiDemoApplication {

	public static void main(String[] args) {

		// SpringApplication.run(SpringBootDiDemoApplication.class, args);

		// Now in order to call the non-static method of Alien class we need to create its object and then call
		// the method that is inside it
		// Alien alien=new Alien();
		// alien.code();
		///  But now we want that our program should internally create this object i should not do it

		// Code for Simple Dependency Injection
		// ApplicationContext context=SpringApplication.run(SpringBootDiDemoApplication.class, args);
		// Alien alien=context.getBean(Alien.class);
		// alien.code();

		// Now lets make the DI little complex by making the Alien class Depenedent on another class too
        ApplicationContext context=SpringApplication.run(SpringBootDiDemoApplication.class, args);
		Alien alien=context.getBean(Alien.class);
		alien.code();

	}

}
