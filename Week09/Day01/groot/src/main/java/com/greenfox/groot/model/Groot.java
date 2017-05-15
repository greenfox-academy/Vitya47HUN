package com.greenfox.groot.model;

public class Groot {
  String received;
  String translated;

  public Groot(String received, String translated) {
    this.received = received;
    this.translated = translated;
  }

  public Groot(){
  }

  public Groot(String input){
    received = input;
    translated = "I am Groot!";
  }


  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
