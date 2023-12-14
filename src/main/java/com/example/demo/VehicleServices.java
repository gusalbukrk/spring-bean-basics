package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleServices {
  public Speakers speakers;
  public Tyres tyres;

  // alternative if @Primary is used
  // public VehicleServices(Speakers speakers, Tyres tyres) {
  //
  public VehicleServices(@Qualifier("boseSpeakers") Speakers speakers, @Qualifier("bridgestoneTyres") Tyres tyres) {
    this.speakers = speakers;
    this.tyres = tyres;
  }
}
