package com.foxclub.controller;

import com.foxclub.model.Fox;
import com.foxclub.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

  @Autowired
  private Fox foxy;
  private Menu menu;


  @RequestMapping("/")
  public String index(Model model) {
//    foxy.setName("A");
//    foxy.setFood("A");
//    foxy.add("Jump");
    model.addAttribute("fox",foxy);
//    model.addAttribute("menu",menu);
    return "index";
  }

  @RequestMapping("/nutritionstore")
  public String nutrition(Model model) {
    model.addAttribute("fox",foxy);
    return "nutritionstore";
  }

  @RequestMapping("/addnutrition")
  public String changenutrition(@RequestParam String food,String drink) {
    foxy.addfood(food);
    foxy.adddrink(drink);
    return "redirect:";
  }

  @RequestMapping("/changenutrition")
  public String addnutrition(@RequestParam String food,String drink) {
    foxy.setFood(food);
    foxy.setDrink(drink);
    return "redirect:";
  }


}
