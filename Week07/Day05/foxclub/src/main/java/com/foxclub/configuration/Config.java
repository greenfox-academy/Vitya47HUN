package com.foxclub.configuration;
import com.foxclub.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean
  public Fox makeFox(){
    return new Fox();
  }

}
