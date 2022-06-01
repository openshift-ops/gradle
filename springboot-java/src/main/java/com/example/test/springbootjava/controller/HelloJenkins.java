package com.example.test.springbootjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bishesh
 */
@RestController
public class HelloJenkins {
    
    @GetMapping("/api/jenkins")
    public String helloJenkins()
    {
        return "HelloJenkins from Gradle";
    }
}

