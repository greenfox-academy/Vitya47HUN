package com.exampractice.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "MEALS")
@Getter
@Setter
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String type;
  private String description;
  private int calories;
  Timestamp timestamp;

  public Meal() {
    this.timestamp = new Timestamp(System.currentTimeMillis());
  }

}