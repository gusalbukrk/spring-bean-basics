package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
  public String name;

  @Autowired
  public Vehicle vehicle;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
