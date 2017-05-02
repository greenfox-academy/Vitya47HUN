package com.greenfox.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  @RequestMapping
  public Greetings greeting(@RequestParam("name") String name){
    Greetings newGreet = new Greetings(aLong.getAndIncrement(),name);
    return newGreet;
  }

  AtomicLong aLong = new AtomicLong(1);

}
