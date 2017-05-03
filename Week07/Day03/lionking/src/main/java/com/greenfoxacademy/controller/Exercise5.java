package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.text.DecimalFormat;
import java.util.ArrayList;


@Controller
public class Exercise5 {
  DecimalFormat formater = new DecimalFormat("0.00");


  @RequestMapping("accounts")
  public String getBankAccount(Model model, @RequestParam("name") String name) {
    ArrayList<BankAccount> accountList = new ArrayList<>();
    accountList.add(new BankAccount("PhantomAssassin",9000,"carry"));
    accountList.add(new BankAccount("Pugna",550,"support"));
    accountList.add(new BankAccount("Pudge",2500,"tank"));
    model.addAttribute("accounts",accountList);

    return "accounts";
  }
}