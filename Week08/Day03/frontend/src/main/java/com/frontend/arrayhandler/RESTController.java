package com.frontend.arrayhandler;

import org.springframework.web.bind.annotation.*;

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
      for (int i = 0; i < input.numbers.size(); i++) {
        result.result += input.numbers.get(i);
      }
    }
    if (input.what.equals("multiply")) {
      result.setResult(1);
      for (int j = 0; j < input.numbers.size(); j++) {
        result.result = result.result * input.numbers.get(j);
      }
    }
    if (input.what.equals("double")) {
      for (int j = 0; j < input.numbers.size(); j++) {

      }
    }
    return result;
  }
}
