package com.frontend.greeter;

import org.springframework.stereotype.Service;

@Service
public class WelcomeMessage {
  String welcome_message;

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public WelcomeMessage(){
  }
}
