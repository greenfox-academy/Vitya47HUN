package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.text.DecimalFormat;


@Controller
public class Exercise4 {
  BankAccount newAccount = new BankAccount("Simba", 2000.000, "lion");
  DecimalFormat formater = new DecimalFormat("0.00");


  @RequestMapping("thisText")
  public String thisText(Model model, @RequestParam("name") String name) {
    model.addAttribute("name",newAccount.getName());
    model.addAttribute("balance",formater.format(newAccount.getBalance()));
    model.addAttribute("type",newAccount.getAnimalType());
    return "thisText";
  }
}