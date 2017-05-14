package com.frontend.logentry;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

  @ExceptionHandler(Exception.class)
  public ErrorMessage someException(Exception e) {
    return new ErrorMessage("Please provide a number!");
  }

  @PostMapping(value = "/arrays")
  public ResultObject calculate(@RequestBody InputObject input) {
    ResultObject result = new ResultObject();
    if (input.what.equals("sum")) {
      result.sum(input.getNumbers());
      }
      else if(input.what.equals("multiply")){
      result.multiply(input.getNumbers());
    }
    else if(input.what.equals("double")){
        result.toDouble(input.getNumbers());
    }
    return result;
    }
  }

