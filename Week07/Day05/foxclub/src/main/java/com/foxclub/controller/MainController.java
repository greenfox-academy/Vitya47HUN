package com.foxclub.controller;

import com.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

  @Autowired
  private Fox foxy;

  @RequestMapping("/")
  public String index(Model model) {
    foxy.setName("Foxyka");
    foxy.setFood("Rabbit");
    foxy.add("Jump");
    model.addAttribute("fox",foxy);

    return "index";
  }

}
