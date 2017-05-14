package com.frontend.logentry;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InputObject {
  String what;
  List<Integer> numbers;

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public InputObject(){
  }
}
