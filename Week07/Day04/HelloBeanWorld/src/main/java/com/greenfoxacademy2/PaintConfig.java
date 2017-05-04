package com.greenfoxacademy2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaintConfig {

  @Bean
  public Paint makePaint(){
    return new Color();
  }
}
