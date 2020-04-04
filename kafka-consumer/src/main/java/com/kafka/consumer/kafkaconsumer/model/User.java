package com.kafka.consumer.kafkaconsumer.model;

public class User {
  private String name;
  private String dept;

  public User(String name, String dept) {
    this.name = name;
    this.dept = dept;
  }

  public String name() {
    return name;
  }

  public void name(String name) {
    this.name = name;
  }

  public String dept() {
    return dept;
  }

  public void dept(String dept) {
    this.dept = dept;
  }
}
