package com.messageservice.configuration;

import com.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

  @Autowired
  MessageService messageService;

}
