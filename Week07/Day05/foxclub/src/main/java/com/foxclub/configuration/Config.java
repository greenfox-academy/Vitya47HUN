package com.foxclub.configuration;
import com.foxclub.model.Fox;
import com.foxclub.model.Menu;
import com.foxclub.model.TrickList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean
  public Fox makeFox(){
    return new Fox();
  }

  @Bean
  public Menu makeMenu(){
    return new Menu();
  }

@Bean
  public TrickList makeTricks(){
    return new TrickList();
}

}
