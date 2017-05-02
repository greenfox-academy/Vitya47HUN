package com.greenfox.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong aLong = new AtomicLong(1);
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};


  Random random = new Random();
  int nextInt = random.nextInt(256*256*256);
  String colorCode = String.format("#%06x", nextInt);

  @RequestMapping("/web/greeting")
  public String greeting(Model model,@RequestParam("name") String name) {
    model.addAttribute("name", " " + name);
    model.addAttribute("number",aLong.getAndIncrement());
    model.addAttribute("hello",hellos);
    model.addAttribute("color",differentColor());
    return "greeting";
  }

//  public String differentHello(String[] input){
//    String currentHello = "";
//    for(int a = 0;a < input.length;a++){
//      Random random = new Random();
//      currentHello = currentHello + " " + input[a];
//    }
//    return currentHello;
//  }

  public String differentColor(){
    String currentColor = "";
    for(int a = 0;a < 256 ;a++){
      Random random = new Random();
      int nextInt = random.nextInt(256*256*256);
      String colorCode = String.format("#%06x", nextInt);
      currentColor = colorCode;

    }
    return currentColor;
  }

}
