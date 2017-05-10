package com.frontend.doubling;

import org.springframework.stereotype.Service;

@Service
public class InputNumber {
  int received;
  int result;

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int input) {
    result = 2 * input;
  }


  public InputNumber(){
  }
}
