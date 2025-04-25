package com.sheridan.akanbiad.web.rest;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sheridan.akanbiad.domain.Car;
import com.sheridan.akanbiad.services.CarService;


import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cars")
public class CarController {
	
	private CarService carService;	
	
	//Get All Cars
	@GetMapping(value={"", "/"}) 
	public List<Car> getCollection() {
		return carService.findAll();
	}
	
	@GetMapping("/{id}")
	public Car getElement(@PathVariable Long id) {
		Car car = carService.findById(id);
		return car;
	}

	@PostMapping(value={"", "/"}, headers= {"Content-type=application/json"}) //this tells our controller to expect a json type from the request body.
	public Car postCollection(@RequestBody Car car) {
		car.setId(null); //to prevent an existing id from being used, which would replace the existing record
		return carService.save(car);
	}
	
	@DeleteMapping("/{id}")
	public void deleteElement(@PathVariable Long id) {
	   carService.deleteById(id);
	}
	
	//put for single element
//	@PutMapping(value={"/{id}"}, headers= {"Content-type=application/json"})
//	public Car putElement(@RequestBody Car car, @PathVariable Long id) {
//		if (carService.findById(id) != null ) {
//			car.setId(id);
//			
//			carService.save(car);
//			return carService.save(car); //update the existing car
//		} else {
//			car.setId(null);
//			
//			return carService.save(car); //save as a new car
//		}		
//	}
//	
//	//put for multiple elements
//	@PutMapping(value={"", "/"}, headers= {"Content-type=application/json"})
//	public List<Car> putCollection(@RequestBody List<Car> cars) {
//		List<Car> carList = new ArrayList<Car>();
//		for (Car s: cars) {
//			if (carService.findById(s.getId()) != null) {
//				carList.add(carService.save(s)); //update the car
//			} else {
//				s.setId(null);
//				carList.add(carService.save(s)); //save the new car
//			}	
//		}
//		return carList;		
//	}

}
