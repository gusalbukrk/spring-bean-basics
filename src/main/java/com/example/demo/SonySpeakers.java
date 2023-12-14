package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary
public class SonySpeakers implements Speakers {
  public void makeSound() {
    System.out.println("Sony Speakers making sound");
  }
}
