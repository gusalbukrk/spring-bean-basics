package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BridgestoneTyres implements Tyres {
  public void rotate() {
    System.out.println("Bridgestone Tyres rotating");
  }
}
