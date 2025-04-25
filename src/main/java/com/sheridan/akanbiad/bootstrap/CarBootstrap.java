package com.sheridan.akanbiad.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sheridan.akanbiad.domain.Car;

import com.sheridan.akanbiad.services.CarService;


import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CarBootstrap implements CommandLineRunner {
	
	private CarService carService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		carService.save(Car.builder().name("Jaguar Chameleon").price(400000.00).quantity(4).dealershipName("The Cleaners").build());
		carService.save(Car.builder().name("Pagani Zonda").price(600000.00).quantity(1).dealershipName("The Painters").build());
		carService.save(Car.builder().name("Ford Mustang").price(250000.00).quantity(6).dealershipName("Sparkles").build());
		carService.save(Car.builder().name("Tesla Roadstar").price(200000.00).quantity(13).dealershipName("The Cleaners").build());
		carService.save(Car.builder().name("Nissan Z").price(40000.00).quantity(14).dealershipName("The Painters").build());
		carService.save(Car.builder().name("McLaren MP4").price(500000.00).quantity(2).dealershipName("Sparkles").build());
		carService.save(Car.builder().name("Ferrari SF90").price(450000.00).quantity(4).dealershipName("The Cleaners").build());
		carService.save(Car.builder().name("Aston Martin Valkyrie").price(700000.00).quantity(1).dealershipName("The Painters").build());
		carService.save(Car.builder().name("Rimac Nevera").price(400000.00).quantity(2).dealershipName("Sparkles").build());
		carService.save(Car.builder().name("Audi R8").price(70000.00).quantity(12).dealershipName("The Cleaners").build());

	
	}

}
