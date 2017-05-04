package com.foxclub.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Fox {
  private String name;
  private String food;
  private List<String> trick;

  public void add(String input){
    trick.add(input);
  }

  public int getTrickSize(){
    return trick.size();
  }
}
