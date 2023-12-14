package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
  public void makeSound() {
    System.out.println("Bose Speakers making sound");
  }
}
