package com.foxclub.controller;
import com.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

  @Autowired
  Fox foxy;

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("name",foxy.getName());
    model.addAttribute("food",foxy.getFood());
    return "index";
  }

}
