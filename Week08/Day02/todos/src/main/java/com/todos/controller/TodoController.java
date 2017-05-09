package com.todos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @RequestMapping("/todo")
  public String todo(Model model) {
    return "todo";
  }

  @RequestMapping("/")
  public String list(Model model) {
    return "index";
  }

  @RequestMapping("/list")
  @ResponseBody
  public String todoadd(Model model) {
    return "This is my first todo";
  }


}
