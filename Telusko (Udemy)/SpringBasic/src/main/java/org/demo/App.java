package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // Simple Object Creation and Calling
        // Alien alien=new Alien();
        // alien.code();

        // Code to implement DI through Basic
        // Now while doing Dependency Injection through Spring Boot App previously we have Spring Boot IOC
        // But here it is a simple project so we need to create the container
        // Code to create the container and the beans for it is present in spring.xml
        // whatever is inside bean we don't have to create object of it

        // The below line is going to spring.xml and creating object of all the things with bean tag
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Alien alien=(Alien) context.getBean("alien");
        //alien.setAge(21);
        // The above line is direct setting the value or put the value in the Alien class but we want to inject this
        // value so we can perform this injection through xml by using property
        System.out.println(alien.getAge());
        alien.code();
    }
}
