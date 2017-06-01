package com.exampractice.controllers;

import com.exampractice.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  MealRepository mealRepository;

  @RequestMapping("/")
  public String index(Model model) {
      model.addAttribute("mealrepo",mealRepository.findAll());
      return "index";
    }
  }

