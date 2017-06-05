package com.exampractice.controllers;

import com.exampractice.models.Food;
import com.exampractice.models.FoodList;
import com.exampractice.models.Response;
import com.exampractice.models.Stats;
import com.exampractice.repositories.FoodRepository;
import com.exampractice.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalorieRestController {

  FoodRepository foodRepo;
  FoodList foodList;
  Stats stat;
  FoodService foodService;

  @Autowired
  public CalorieRestController(FoodList foodList, FoodRepository foodRepo, Stats stat, FoodService foodService) {
    this.foodList = foodList;
    this.foodRepo = foodRepo;
    this.stat = stat;
    this.foodService = foodService;
  }

  @GetMapping("/getmeals")
  public FoodList getmeals() {
    foodList.setFoods(foodService.getMeals());
    return foodList;
  }

  @GetMapping("/getstats")
  public Stats getstats() {
    stat.setNumberOfMeals(foodService.getNumberOfMeals());
    stat.setTotalCalories(foodService.getTotalCalories());
    return stat;
  }

  @PostMapping("/meal")
  public Response addMeal(@RequestBody Food food) {
    foodRepo.save(food);
    return new Response("ok");
  }

  @PutMapping("/meal")
  public Response updateMeal(@RequestBody Food food) {
    Food updateMeal = foodRepo.findOne(food.getId());
    updateMeal.setDescription(food.getDescription());
    updateMeal.setType(food.getType());
    updateMeal.setCalories(food.getCalories());
    updateMeal.setDate(food.getDate());
    foodRepo.save(updateMeal);
    return new Response("ok");
  }

  @DeleteMapping("/meal")
  public Response deleteMeal(@RequestBody Food food) {
    foodRepo.delete(food.getId());
    return new Response("ok");
  }
}