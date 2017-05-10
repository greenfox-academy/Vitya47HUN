package com.frontend.dountil;

import com.frontend.appenda.Dountil;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;



@RestController
public class RESTController {


  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage someException(MissingServletRequestParameterException e){
    String error = e.getParameterName();
    return new ErrorMessage("Please provide a " + error + "!");
  }

  @PostMapping(value = "/dountil/{what}")
  public Dountil calculate(@PathVariable(value = "what")String what, @RequestBody  Mynumber until){
    Dountil dountil = new Dountil();
   if(what.equals("sum")){
     for(int i = 0;i < until.getUntil() + 1;i++){
       dountil.setResult(dountil.getResult() + i);
     }
   }
    return dountil;
  }

}