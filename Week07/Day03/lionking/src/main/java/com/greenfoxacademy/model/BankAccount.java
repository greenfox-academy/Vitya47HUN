package com.greenfoxacademy.model;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BankAccount {
  String name;
  double balance;
  String animalType;
  boolean isHeBad;
}
