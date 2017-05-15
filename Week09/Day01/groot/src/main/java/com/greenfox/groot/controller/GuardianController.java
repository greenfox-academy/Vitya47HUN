package com.greenfox.groot.controller;


import com.greenfox.groot.model.ErrorMessage;
import com.greenfox.groot.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @Autowired
  Message message;

  @ExceptionHandler(Exception.class)
  public ErrorMessage someException(Exception e) {
    return new ErrorMessage("I am Groot!");
  }

@GetMapping(value = "/groot/{input}")
  public Message message(@PathVariable("input") String input){
  message.setReceived(input);
  message.setTranslated("I am groot!");
  return message;
}

}
