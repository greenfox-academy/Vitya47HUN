package com.foxclub.model;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Fox {
  private String name;
  private String food;
  private String drink;
  private List<String> trick = new ArrayList<>();
  private List<String> foods = new ArrayList<>();
  private List<String> drinks = new ArrayList<>();

  public void add(final String input){
    trick.add(input);
  }

  public int getTrickSize(){
    return trick.size();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }


  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void addfood(final String input) {
    foods.add(input);
  }

  public void adddrink(final String input) {
    drinks.add(input);
  }

  public int getfoodsSize() {
    return foods.size();
  }

  public int getdrinksSize() {
    return drinks.size();
  }

  public List<String> getDrinks() {
    return drinks;
  }
  public List<String> getFoods() {
    return foods;
  }

}
