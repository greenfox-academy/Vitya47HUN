package com.foxclub.controller;

import com.foxclub.model.Fox;
import com.foxclub.model.Menu;
import com.foxclub.model.TrickList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

  @Autowired
  private Menu menu;

  @Autowired
  private TrickList trickList;

  @Autowired
  private Fox foxy;


  @RequestMapping("/")
  public String index(Model model) {
    foxy.setName("Reinhardt a Selymes");
    model.addAttribute("fox", foxy);
    model.addAttribute("menu", menu);
    model.addAttribute("list", trickList);
    return "index";
  }

  @RequestMapping("/nutritionstore")
  public String nutrition(Model model) {
    model.addAttribute("fox", foxy);
    model.addAttribute("menu", menu);
    return "nutritionstore";
  }

  @RequestMapping("/addnutrition")
  public String changenutrition(@RequestParam String food,
                                @RequestParam String drink) {
    if (!food.equals("")) {
      menu.addfood(food);
    }
    if (!drink.equals("")) {
      menu.adddrink(drink);
    }
    return "redirect:";
  }


  @RequestMapping("/changenutrition")
  public String addnutrition(@RequestParam String food, String drink) {
    foxy.setFood(food);
    foxy.setDrink(drink);
    return "redirect:";
  }

  @RequestMapping("/trickcenter")
  public String trickcenter(Model model) {
    model.addAttribute("fox", foxy);
    model.addAttribute("list", trickList);
    return "trickcenter";
  }

  @RequestMapping("/addtrick")
  public String addtrick(@RequestParam String trick) {
    if(!trick.equals("")) {
      trickList.addTrick(trick);
    }
    return "redirect:";
  }

  @RequestMapping("/learntrick")
  public String changetrick(@RequestParam(value = "trick", required = false) String trick) {
      foxy.add(trick);
      trickList.delete(trick);
      return "redirect:";
    }

//  @RequestMapping("/dotrick")
//  public String dotrick(@RequestParam String trick) {
//    trickList.getTricks().get(1);
//    return "redirect:";
//  }

  }



