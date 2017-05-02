package com.greenfox.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping
  public Greetings greeting(@RequestParam("name") String name){
    Greetings newGreet = new Greetings(1,"Hello Your name");
    return newGreet;
  }

}
