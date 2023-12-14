package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class VehicleServices {
  public Speakers speakers;
  public Tyres tyres;

  public VehicleServices(Speakers speakers, Tyres tyres) {
    this.speakers = speakers;
    this.tyres = tyres;
  }
}
