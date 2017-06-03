package com.exampractice.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "MEALTYPE")
@Getter
@Setter

public class MealType {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String type;

  public MealType() {
  }

  public MealType(String type) {
    this.type = type;
  }
}