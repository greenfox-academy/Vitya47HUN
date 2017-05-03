package com.greenfoxacademy.controller;
import com.greenfoxacademy.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Exercise1 {
  BankAccount newAccount = new BankAccount("Simba", 2000, "lion",true);

  @RequestMapping("getBankAccount1")
  public String getBankAccount(Model model, @RequestParam("name") String name) {
    model.addAttribute("name",newAccount.getName());
    model.addAttribute("balance",newAccount.getBalance());
    model.addAttribute("type",newAccount.getAnimalType());
    return "getBankAccount1";
  }
}
