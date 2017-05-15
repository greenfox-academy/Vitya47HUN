package com.greenfox.groot.controller;


import com.greenfox.groot.model.*;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

  CalorieTable calorieTable = new CalorieTable();
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
      ship.setShipstatus("full");
      System.out.println("full");
    }else if(rocket.getCaliber25() + rocket.getCaliber30() + rocket.getCaliber50() > MaximumAmount){
      rocket.setShipstatus("overloaded");
      ship.setShipstatus("overloaded");
      System.out.println("over");
    }else if(caliber.equals(".25")) {
      ship.setReceived(caliber);
      rocket.setCaliber25(rocket.getCaliber25() + amount);
      ship.setAmount(rocket.getCaliber25());
      ship.setShipstatus(ship.getShipstatus().valueOf(ship.getAmount() / 125) + "%");
      rocket.setShipstatus(ship.getShipstatus().valueOf(ship.getAmount() / 125) + "%");
    }else if(caliber.equals(".30")) {
      ship.setReceived(caliber);
      rocket.setCaliber30(rocket.getCaliber30() + amount);
      ship.setAmount(rocket.getCaliber30());
      ship.setShipstatus(ship.getShipstatus().valueOf(ship.getAmount() / 125) + "%");
      rocket.setShipstatus(ship.getShipstatus().valueOf(ship.getAmount() / 125) + "%");
    }else if(caliber.equals(".50")) {
      ship.setReceived(caliber);
      rocket.setCaliber50(rocket.getCaliber50() + amount);
      ship.setAmount(rocket.getCaliber50());
      ship.setShipstatus(ship.getShipstatus().valueOf(ship.getAmount() / 125) + "%");
      rocket.setShipstatus(ship.getShipstatus().valueOf(ship.getAmount() / 125) + "%");
      System.out.println("50cal added");
    }
    return ship;
  }

  @RequestMapping(value = "/drax", method = RequestMethod.GET)
  public CalorieTable getDraxTable(){
    return calorieTable;
  }

  // -- WORKING WITH GET --- //

//  @RequestMapping(value = "/drax/add", method = RequestMethod.GET)
//  public CalorieTable addFoodToTable(@RequestParam("foodName") String foodName,@RequestParam("foodAmount") int foodAmount,@RequestParam("foodCalorie") int foodCalorie){
//    Food currentFood = new Food();
//    currentFood.setName(foodName);
//    currentFood.setAmount(foodAmount);
//    currentFood.setCalorie(foodCalorie * foodAmount);
//    calorieTable.addFood(currentFood);
//    return calorieTable;
//  }


  @RequestMapping(value = "/drax/add", method = RequestMethod.POST)
  public Food addFoodToTable(@RequestBody Food food){
    food.setCalorie(food.getCalorie() * food.getAmount());
    calorieTable.addFood(food);
    return food;
  }

  @RequestMapping(value = "/drax/remove/{name}", method = RequestMethod.DELETE)
  public CalorieTable deleteFoodToTable(@PathVariable String name){
    calorieTable.removeFood(name);
    return calorieTable;
  }

  @RequestMapping(value = "/drax/update/{name}", method = RequestMethod.PUT)
  public Food deleteFoodToTable(@PathVariable String name,@RequestBody Food food){
    calorieTable.getElementByName(name).setAmount(food.getAmount());
    return food;
  }

}
