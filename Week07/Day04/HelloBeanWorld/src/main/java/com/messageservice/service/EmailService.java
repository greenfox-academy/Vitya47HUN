package com.messageservice.service;

public class EmailService implements MessageService{
  @Override
  public void proceedMessage(String from,String to) {
    System.out.println("Email was sent from : " + from + " to " + to );

  }
}
