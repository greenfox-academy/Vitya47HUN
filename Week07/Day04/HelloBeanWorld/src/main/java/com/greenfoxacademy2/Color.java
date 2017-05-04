package com.greenfoxacademy2;


public class Color implements Paint{
  String color;

  @Override
  public void printColor() {
    System.out.println("it is a :" + color);
  }

  @Override
  public void setColor(String color) {
    this.color = color;
  }

}
