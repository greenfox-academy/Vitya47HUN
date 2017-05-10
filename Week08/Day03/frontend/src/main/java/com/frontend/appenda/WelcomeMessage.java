package com.frontend.appenda;

import org.springframework.stereotype.Service;

@Service
public class WelcomeMessage {
  String appended;

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

  public WelcomeMessage(){
  }
}
