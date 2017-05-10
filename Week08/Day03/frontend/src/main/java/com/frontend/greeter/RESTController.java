package com.frontend.greeter;

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

  @RequestMapping(value = "/greeter",method = RequestMethod.GET)
  public WelcomeMessage greeter(@RequestParam(value = "name",required = true) String input,
                                @RequestParam(value = "title",required = true) String input2) {
    message.setWelcome_message("Oh, hi there " + input + ", my dear " + input2 + "!");
    return message;
  }

}