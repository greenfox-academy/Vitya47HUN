package com.foxclub.model;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Fox {
  private String name;
  private String food;
  private List<String> trick = new ArrayList<>();

  public void add(final String input){
    trick.add(input);
  }

  public int getTrickSize(){
    return trick.size();
  }
}
