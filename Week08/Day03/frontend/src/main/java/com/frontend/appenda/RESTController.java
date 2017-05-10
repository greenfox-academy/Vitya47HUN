package com.frontend.appenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;


@RestController
public class RESTController {

  @Autowired
  WelcomeMessage message;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage someException(MissingServletRequestParameterException e){
    String error = e.getParameterName();
    return new ErrorMessage("Please provide a " + error + "!");
  }

  @RequestMapping(value = "/appenda/{appendable}",method = RequestMethod.GET)
  public WelcomeMessage greeter(@PathVariable(value = "appendable",required = true) String input){
    message.setAppended(input + "a");
    return message;
  }

}