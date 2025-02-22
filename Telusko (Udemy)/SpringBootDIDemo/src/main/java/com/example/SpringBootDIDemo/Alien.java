package com.example.SpringBootDIDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Making this class as component i am making sure that the spring knows that it has to manage this class
@Component
public class Alien {
    // To make it complex
    @Autowired
    Laptop laptop;
    public void code()
    {
        // System.out.println("Coding");

        // To make it complex
        laptop.compile();
    }
}
