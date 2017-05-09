package com.todos.controller;

import com.todos.model.Todo;
import com.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class TodoController {

  @Autowired
  TodoRepository TodoRepo;


  @RequestMapping({"/", "/list"})
  public String index(Model model) {
    return "index";
  }

  @RequestMapping("/todo")
  public String todo(Model model) {
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
