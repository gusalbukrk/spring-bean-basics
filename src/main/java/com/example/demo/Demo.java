package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(Config.class);

		var person = context.getBean(Person.class);
		// var vehicle = context.getBean(Vehicle.class);

		// System.out.println(person.vehicle.vehicleServices.speakers.makeSound());
		person.vehicle.vehicleServices.speakers.makeSound();
		person.vehicle.vehicleServices.tyres.rotate();

		context.close();
	}
}