package com.frontend.dountil;

import org.springframework.stereotype.Service;

@Service
public class Mynumber {
  int until;

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public Mynumber(){
  }
}
