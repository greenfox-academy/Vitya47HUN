package com.foxclub.model;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class TrickList {
  private List<String> tricks = new ArrayList<>();

  public TrickList(){
    tricks.add("Fly");
    tricks.add("Program Java on a GODLIKE level");
    tricks.add("Generate ION shield");
    tricks.add("Inhale oxygen intentionally");
  }

  public void addTrick(final String input) {
    tricks.add(input);
  }

  public int getTricksSize() {
    return tricks.size();
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void delete(String id) {
    tricks.remove(id);
  }


}
