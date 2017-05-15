package com.greenfox.groot.controller;


import com.greenfox.groot.model.ErrorMessage;
import com.greenfox.groot.model.Message;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @ExceptionHandler(Exception.class)
  public ErrorMessage someException(Exception e) {
    return new ErrorMessage("I am Groot!");
  }

@GetMapping(value = "/groot/{input}")
  public Message message(@PathVariable("input") String input){
  Message message = new Message();
  return message;
}

}
