package com.greenfoxacademy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloBeanWorldConfig {

  @Bean
    public HelloBeanWorld beaningMessage() {
    return new HelloBeanWorld();
  }

}