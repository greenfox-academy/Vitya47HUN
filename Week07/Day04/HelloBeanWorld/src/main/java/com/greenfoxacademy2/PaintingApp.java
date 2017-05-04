package com.greenfoxacademy2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaintingApp implements CommandLineRunner {

  @Autowired
  Paint color;

  public static void main(String[] args) {
    SpringApplication.run(PaintingApp .class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    color.setColor("red");
   color.printColor();

  }

}
