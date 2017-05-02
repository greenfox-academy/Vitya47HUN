package com.greenfox.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  @RequestMapping("/web/greeting")
  public String greeting(Model model,@RequestParam("name") String name) {
    model.addAttribute("name", " " + name);
    return "greeting";
  }

  public AtomicLong greetingnum(Model model){
   aLong.getAndIncrement();
   return aLong;
  }

  AtomicLong aLong = new AtomicLong(1);
}
