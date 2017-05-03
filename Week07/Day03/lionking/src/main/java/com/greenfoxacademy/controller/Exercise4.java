package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.text.DecimalFormat;


@Controller
public class Exercise4 {

  @RequestMapping("thisText")
  public String thisText(Model model,@RequestParam("name") String name) {
    model.addAttribute("string","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "thisText";
  }
}