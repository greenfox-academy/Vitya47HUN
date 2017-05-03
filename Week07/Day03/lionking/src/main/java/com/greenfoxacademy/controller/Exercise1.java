package com.greenfoxacademy.controller;
import com.greenfoxacademy.model.BankAccount;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class Exercise1 {
  BankAccount newAccount = new BankAccount("Simba", 2000, "lion");

  @RequestMapping("account")
  public String getBankAccount(Model model, @RequestParam("account") String name) {
    model.addAttribute("name",newAccount.getName());
    model.addAttribute("balance",newAccount.getBalance());
    model.addAttribute("type",newAccount.getAnimalType());
    return "getBankAccount";
  }
}
