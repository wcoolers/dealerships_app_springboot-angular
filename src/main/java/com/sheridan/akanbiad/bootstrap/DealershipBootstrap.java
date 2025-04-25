package com.sheridan.akanbiad.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sheridan.akanbiad.domain.Dealership;

import com.sheridan.akanbiad.services.DealershipService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DealershipBootstrap implements CommandLineRunner {
	
	private DealershipService dlshpService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		dlshpService.save(Dealership.builder().name("The Cleaners").build());
		dlshpService.save(Dealership.builder().name("The Painters").build());
		dlshpService.save(Dealership.builder().name("Sparkles").build());

	}

}
