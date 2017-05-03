package com.greenfoxacademy.controller;
import com.greenfoxacademy.model.BankAccount;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class Exercise1 {
  @RequestMapping
  public BankAccount getBankAccount(@RequestParam("account") String name) {
    BankAccount newAccount = new BankAccount("Simba", 2000, "lion");
    return newAccount;
  }
}
