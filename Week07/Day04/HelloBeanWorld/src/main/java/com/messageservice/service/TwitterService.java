package com.messageservice.service;

public class TwitterService implements MessageService{

  @Override
  public void proceedMessage(String from,String to) {
    System.out.println("Twitter was sent from : " + from + " to " + to );

  }
}
