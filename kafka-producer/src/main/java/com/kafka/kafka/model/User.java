package com.kafka.kafka.model;

public class User {
  private String name;
  private String dept;
  private Long salary;

  public User(String name, String dept, Long salary) {
    this.name = name;
    this.dept = dept;
    this.salary = salary;
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

  public Long salary() {
    return salary;
  }

  public void salary(Long salary) {
    this.salary = salary;
  }
}
