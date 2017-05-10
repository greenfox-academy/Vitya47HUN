package com.frontend.arrayhandler;

import org.springframework.web.bind.annotation.*;


@RestController
public class RESTController {

  @ExceptionHandler(Exception.class)
  public ErrorMessage someException(Exception e){
    return new ErrorMessage("Please provide a number!");
  }

  @PostMapping(value = "/arrays")
  public ResultObject calculate(@RequestBody InputObject input) {
    ResultObject result = new ResultObject();
    if (input.what.equals("sum")) {
      for (int i = 0; i < input.numbers.size(); i++) {
        result.result +=input.numbers.get(i);
      }
    }
//      if (what.equals("factor")) {
//        result.setResult(1);
//        for (int j = 1; j
//                < input.getUntil() + 1; j++) {
//          result.setResult(result.getResult() * j);
//          System.out.println(result.getResult());
//        }
//      }
    return result;
    }
  }
