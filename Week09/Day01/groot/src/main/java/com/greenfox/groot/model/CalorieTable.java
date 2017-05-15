package com.greenfox.groot.model;

import java.util.ArrayList;
import java.util.List;

public class CalorieTable {
  List<Food> foodList;

  public CalorieTable(){
    foodList = new ArrayList<>();
  }

  public List<Food> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<Food> foodList) {
    this.foodList = foodList;
  }
}
