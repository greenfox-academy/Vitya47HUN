package com.todos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public Todo(){
    this.id = id;
    this.title = title;
    isUrgent = false;
    isDone = false;
  }

}
