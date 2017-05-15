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

  public void addFood(Food food){
    foodList.add(food);
  }

  public void removeFood(String name){
    for (int i=0;i<foodList.size();i++){
      if (foodList.get(i).name.equals(name)){
        foodList.remove(foodList.get(i));
      }
    }
  }
}
