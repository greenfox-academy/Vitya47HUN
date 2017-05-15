package com.greenfox.groot.model;

public class Message {
  String received;
  String translated;

  public Message(String received, String translated) {
    this.received = received;
    this.translated = translated;
  }

  public Message(){
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
