package com.exampractice.services;

import com.exampractice.models.Food;
import com.exampractice.models.FoodList;
import java.util.ArrayList;
import java.util.List;
import com.exampractice.models.FoodType;
import com.exampractice.models.Stats;
import com.exampractice.repositories.FoodRepository;
import com.exampractice.repositories.FoodTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
  FoodList foodList;
  FoodRepository foodRepo;
  Stats stats;
  FoodTypeRepository foodtypeRepo;

  @Autowired
  public FoodService(FoodList foodList, FoodRepository foodRepo, Stats stats, FoodTypeRepository foodtypeRepo) {
    this.foodList = foodList;
    this.foodRepo = foodRepo;
    this.stats = stats;
    this.foodtypeRepo = foodtypeRepo;
  }

  public List<Food> getMeals() {
    List<Food> meals = new ArrayList<>();
    Iterable foods = foodRepo.findAll();
    for (Object food : foods) {
      meals.add(((Food) food));
    }
    return meals;
  }

  public List<String> getFoodTypes() {
    List<String> type = new ArrayList<>();
    Iterable foodtype = foodtypeRepo.findAll();
    for (Object food : foodtype) {
      type.add(((FoodType) food).getType());
    }
    return type;
  }

  public int getNumberOfMeals() {
    Iterable foods = foodRepo.findAll();
    int numberOfFoods = 0;
    for (Object food : foods) {
      numberOfFoods++;
    }
    return numberOfFoods;
  }

  public int getTotalCalories() {
    Iterable foods = foodRepo.findAll();
    int totalCalories = 0;
    for (Object food : foods) {
      totalCalories += ((Food) food).getCalories();
    }
    return totalCalories;
  }
}