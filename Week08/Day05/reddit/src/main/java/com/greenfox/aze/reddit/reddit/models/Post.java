package com.greenfox.aze.reddit.reddit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String username;
  String title;
  String href;
  Timestamp timestamp;
  int score;

  public Post(){
    this.timestamp = new Timestamp(System.currentTimeMillis() / 1000);
  }

  public Post(String title) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis() / 1000);
    this.score = score;
    this.username = username;
  }

  public long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  public int getScore() {
    return score;
  }

  public void addScore(){
    score++;
  }

  public void downScore(){
    score--;
  }

  public void changeTitle(){
    this.title = title;
  }

  public void setScore(int score) {
    this.score = score;
  }


}