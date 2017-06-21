package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello-world")
public class HelloWorldController {

   // private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

    //@RequestMapping(method=RequestMethod.GET)
   /* public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting();
    }*/
  //  @RequestMapping(method=RequestMethod.GET)
	@RequestMapping("/hello-world")
	public  RootObject sayHello() {
        return new RootObject();
}}