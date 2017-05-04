package com.greenfoxacademy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner {

	@Autowired
	HelloBeanWorld hello;

	public static void main(String[] args) {
		SpringApplication.run(HelloBeanWorldApplication.class, args);

  }
  @Override
  public void run(String... args) throws Exception {
    hello.setMessage("matek");
    hello.getMessage();

  }

}
