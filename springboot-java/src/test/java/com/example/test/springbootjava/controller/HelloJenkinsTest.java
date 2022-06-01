package com.example.test.springbootjava.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;


import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author Bishesh
 */
@WebMvcTest
public class HelloJenkinsTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloJenkins ()throws Exception{
        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/api/jenkins"));

        result.andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("HelloJenkins from Gradle"));

    }

}
