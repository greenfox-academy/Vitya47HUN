package com.todov2.controller;

import com.todov2.model.Todo;
import com.todov2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  @Autowired
  TodoRepository TodoRepo;

  @RequestMapping({"/", "/list"})
  public String index(Model model) {
    return "index";
  }

  @RequestMapping("/todo")
  public String todo(Model model,@RequestParam(value = "isActive", required = false) String bool) {
    model.addAttribute("bool",bool);
    model.addAttribute("todo", TodoRepo.findAll());
    return "todo";
  }

  @RequestMapping("/addTodo")
  public String addTodo(Model model, @RequestParam("title") String param) {
    TodoRepo.save(new Todo(param));
    model.addAttribute("notes", TodoRepo.findAll());
    return "redirect:/todo";
  }
}
