package com.messageservice.configuration;
import com.messageservice.service.EmailService;
import com.messageservice.service.MessageService;
import com.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageProceeder makeProceeder(){
    return new MessageProceeder();
  }

  @Bean
  public MessageService makeEmail(){
    return new EmailService();
  }

  @Primary
  @Bean
  public MessageService makeTwitter(){
    return new TwitterService();
  }

}
