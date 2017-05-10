package com.frontend.model;

import org.springframework.stereotype.Component;

@Component
public class InputNumber {
  int recieved;
  int result;

  public int getRecieved() {
    return recieved;
  }

  public void setRecieved(int recieved) {
    this.recieved = recieved;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public InputNumber(int recieved, int result) {
    this.recieved = recieved;
    this.result = result;
  }

  public InputNumber(){

  }
}
