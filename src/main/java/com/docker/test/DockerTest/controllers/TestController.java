package com.docker.test.DockerTest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("/")
    public Map<String, Object> getValues(){
        Map<String, Object> data = new HashMap<>();
        data.put("message", "Java api is working");
        data.put("languages", Arrays.asList("Java", "Python", "C++"));
        data.put("code", 235);
        return data;
    }
}
