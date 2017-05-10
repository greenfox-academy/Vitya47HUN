package com.frontend.controller;

import com.frontend.model.InputNumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RESTController {

  @Autowired
  InputNumber number;

  @RequestMapping("/doubling/{input}")
  public InputNumber doublingtest(@PathVariable("input") int input) {
    number.setRecieved(input);
    number.setResult(number.getRecieved() * 2);
    return number;
  }

}