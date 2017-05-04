package com.foxclub.controller;
import com.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class MainController {

  @Autowired
  Fox foxy;

  @RequestMapping("/")
  public String index(Model model) {
    foxy.setName("Foxyka");
    foxy.setFood("Rabbit");
    model.addAttribute("name",foxy.getName());
    model.addAttribute("food",foxy.getFood());
    model.addAttribute("tricks",foxy.getTricks());
    return "index";
  }

}
