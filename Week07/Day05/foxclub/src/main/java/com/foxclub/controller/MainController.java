package com.foxclub.controller;

import com.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

  @Autowired
  private Fox foxy;

  @RequestMapping("/")
  public String index(Model model) {
//    foxy.setName("A");
//    foxy.setFood("A");
//    foxy.add("Jump");
    model.addAttribute("fox",foxy);
    return "index";
  }

  @RequestMapping("/nutritionstore")
  public String nutrition(Model model1) {
    return "nutritionstore";
  }

  @RequestMapping("/changenutrition")
  public String changenutrition(@RequestParam String food,String drink) {
    foxy.setFood(food);
    foxy.setDrink(drink);
    return "redirect:";
  }


}
