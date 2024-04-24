package com.tiple.rest.webservices.restfulwebservices.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Stack;

//RestAPI
@RestController
public class HelloWorldController {
    // /hello-world
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }


    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping (path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldVariable(@PathVariable String name){
        return new HelloWorldBean(
                String.format("Hello World, %s", name));
    }


}
