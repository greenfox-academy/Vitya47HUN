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
  private List<String> tricks = new ArrayList<>();

  public void add(final String input){
    tricks.add(input);
  }

  public int getTrick(String s){
    return tricks.indexOf(s);
  }

  public int getTricksSize(){
    return tricks.size();
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

}
