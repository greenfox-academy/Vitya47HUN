package com.greenfox.groot.controller;


import com.greenfox.groot.model.ErrorMessage;
import com.greenfox.groot.model.Groot;
import com.greenfox.groot.model.Yondu;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage someException(MissingServletRequestParameterException e) {
    String error = e.getParameterName();
    return new ErrorMessage("I am Groot!");
  }

  @RequestMapping(value = "/groot", method = RequestMethod.GET)
  public Groot getMessage(@RequestParam("message") String message) {
    Groot groot = new Groot(message);
    return groot;
  }

  @RequestMapping(value = "/yondu", method = RequestMethod.GET)
  public Yondu getMessage(@RequestParam("distance") double distance,@RequestParam("time") double time){
    Yondu yondu = new Yondu(distance,time);
    return yondu;
  }

}
