package com.foxclub.model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TrickList {
  private List<String> tricks = new ArrayList<>();

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
