package com.messageservice.configuration;
import com.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

  @Autowired
  MessageService messageService;

  public void messageProceed(String from,String to){
    messageService.proceedMessage(from,to);
  }

}


