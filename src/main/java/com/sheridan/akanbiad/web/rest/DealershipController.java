package com.sheridan.akanbiad.web.rest;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sheridan.akanbiad.domain.Dealership;
import com.sheridan.akanbiad.services.DealershipService;


import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/dealerships")
public class DealershipController {
	
	private DealershipService dealershipService;	
	
	//Get All Dealerships
	@GetMapping(value={"", "/"}) 
	public List<Dealership> getCollection() {
		return dealershipService.findAll();
	}
	
	@GetMapping("/{id}")
	public Dealership getElement(@PathVariable Long id) {
		Dealership dealership = dealershipService.findById(id);
		return dealership;
	}

	@PostMapping(value={"", "/"}, headers= {"Content-type=application/json"}) //this tells our controller to expect a json type from the request body.
	public Dealership postCollection(@RequestBody Dealership dealership) {
		dealership.setId(null); //to prevent an existing id from being used, which would replace the existing record
		return dealershipService.save(dealership);
	}
	
	//put for single element
//	@PutMapping(value={"/{id}"}, headers= {"Content-type=application/json"})
//	public Dealership putElement(@RequestBody Dealership dealership, @PathVariable Long id) {
//		if (dealershipService.findById(id) != null ) {
//			dealership.setId(id);
//			
//			dealershipService.save(dealership);
//			return dealershipService.save(dealership); //update the existing dealership
//		} else {
//			dealership.setId(null);
//			
//			return dealershipService.save(dealership); //save as a new dealership
//		}		
//	}
//	
//	//put for multiple elements
//	@PutMapping(value={"", "/"}, headers= {"Content-type=application/json"})
//	public List<Dealership> putCollection(@RequestBody List<Dealership> dealerships) {
//		List<Dealership> dealershipList = new ArrayList<Dealership>();
//		for (Dealership s: dealerships) {
//			if (dealershipService.findById(s.getId()) != null) {
//				dealershipList.add(dealershipService.save(s)); //update the dealership
//			} else {
//				s.setId(null);
//				dealershipList.add(dealershipService.save(s)); //save the new dealership
//			}	
//		}
//		return dealershipList;		
//	}

}
