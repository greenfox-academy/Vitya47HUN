package com.frontend.doubling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RESTController {

  @Autowired
  InputNumber doubling;

  @ExceptionHandler(Exception.class)
  public ErrorMessage someException(Exception e){
    return new ErrorMessage("Please provide an input!");
  }

  @RequestMapping(value = "/doubling",method = RequestMethod.GET)
  public InputNumber doubling(@RequestParam(value = "input",required = false) int input) {
    doubling.setReceived(input);
    doubling.setResult(input);
    return doubling;
  }

}