package com.foxclub.model;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Trick {
  private static int lastId = 0;
  public String name;
  public int id;

  public Trick(String n) {
    name = n;
    id = lastId;
    lastId++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
