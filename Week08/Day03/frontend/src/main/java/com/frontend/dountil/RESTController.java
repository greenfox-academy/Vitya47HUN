package com.frontend.dountil;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;


@RestController
public class RESTController {

  @ExceptionHandler(Exception.class)
  public ErrorMessage someException(Exception e){
    return new ErrorMessage("Please provide a number!");
  }

  @PostMapping(value = "/dountil/{what}")
  public Dountil calculate(@PathVariable(value = "what") String what, @RequestBody Mynumber until) {
    Dountil dountil = new Dountil();
    if (what.equals("sum")) {
      for (int i = 0; i < until.getUntil() + 1; i++) {
        dountil.setResult(dountil.getResult() + i);
      }
    }
      if (what.equals("factor")) {
        dountil.setResult(1);
        for (int j = 1; j < until.getUntil() + 1; j++) {
          dountil.setResult(dountil.getResult() * j);
        }
      }
    return dountil;
    }
  }
