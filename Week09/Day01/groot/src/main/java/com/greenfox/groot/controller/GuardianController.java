package com.greenfox.groot.controller;


import com.greenfox.groot.model.*;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

  Rocket rocket = new Rocket();
  Ship ship = new Ship();

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage someException(MissingServletRequestParameterException e) {
    String error = e.getParameterName();
    return new ErrorMessage("I am Groot!");
  }

  @RequestMapping(value = "/groot", method = RequestMethod.GET)
  public Groot getMessageGroot(@RequestParam("message") String message) {
    Groot groot = new Groot(message);
    return groot;
  }

  @RequestMapping(value = "/yondu", method = RequestMethod.GET)
  public Yondu getMessageYondu(@RequestParam("distance") double distance,@RequestParam("time") double time){
    Yondu yondu = new Yondu(distance,time);
    return yondu;
  }

  @RequestMapping(value = "/rocket", method = RequestMethod.GET)
  public Rocket getShipStatus(){
    return rocket;
  }

  @RequestMapping(value = "/rocket/fill", method = RequestMethod.GET)
  public Ship fillShip(@RequestParam("caliber") String caliber, @RequestParam("amount") int amount){
    int MaximumAmount = 12500;
    if(rocket.getCaliber25() + rocket.getCaliber30() + rocket.getCaliber50() == MaximumAmount) {
      rocket.setReady(true);
      rocket.setShipstatus("full");
    }if(rocket.getCaliber25() + rocket.getCaliber30() + rocket.getCaliber50() > MaximumAmount){
      rocket.setShipstatus("overloaded");
    }if(caliber.equals(".25")) {
      ship.setReceived(caliber);
      rocket.setCaliber25(rocket.getCaliber25() + amount);
      ship.setAmount(ship.getAmount() + rocket.getCaliber25());
      ship.setShipstatus(ship.getShipstatus().valueOf(ship.getAmount() / 125) + "%");
    }if(caliber.equals(".30")) {
      ship.setReceived(caliber);
      rocket.setCaliber30(rocket.getCaliber30() + amount);
      ship.setAmount(ship.getAmount() + rocket.getCaliber30());
      ship.setShipstatus(ship.getShipstatus().valueOf(ship.getAmount() / 125) + "%");
    }if(caliber.equals(".50")) {
      ship.setReceived(caliber);
      rocket.setCaliber50(rocket.getCaliber50() + amount);
      ship.setAmount(ship.getAmount() + rocket.getCaliber50());
      ship.setShipstatus(ship.getShipstatus().valueOf(ship.getAmount() / 125) + "%");
    }
    return ship;
  }

}
