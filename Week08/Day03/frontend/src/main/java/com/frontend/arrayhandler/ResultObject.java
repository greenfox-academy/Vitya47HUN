package com.frontend.arrayhandler;

import java.util.List;

public class ResultObject {
  Object result;

  public ResultObject() {
  }

  public void setResult(int result) {
    this.result = result;
  }

  public Object getResult() {
    return result;
  }

  public void sum(List<Integer> numbers) {
    int tempNumber = 0;
    for (int i : numbers) {
      tempNumber = tempNumber + i;
    }
    this.result = tempNumber;
  }

  public void multiply(List<Integer> numbers) {
    int tempNumber = 1;
    for (int i : numbers) {
      tempNumber = tempNumber * i;
    }
    this.result = tempNumber;
  }

  public void toDouble(List<Integer> numbers) {
    int[] tempNumber = new int[numbers.size()];
    for  (int i = 0; i < numbers.size(); i++) {
      tempNumber[i] = numbers.get(i) * 2;
    }
    this.result = tempNumber;
  }
}
