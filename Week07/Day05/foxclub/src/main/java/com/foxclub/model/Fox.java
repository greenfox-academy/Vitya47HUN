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
  private List<Trick> tricks;
  private String food;

  public Fox(List<Trick> tricks) {
    this.tricks = tricks;
  }

}
