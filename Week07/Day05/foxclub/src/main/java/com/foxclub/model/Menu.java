package com.foxclub.model;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Menu {
  private List<String> foods = new ArrayList<>();
  private List<String> drinks = new ArrayList<>();

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