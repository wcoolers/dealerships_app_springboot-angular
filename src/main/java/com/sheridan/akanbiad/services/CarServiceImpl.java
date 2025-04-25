package com.sheridan.akanbiad.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sheridan.akanbiad.domain.Car;
import com.sheridan.akanbiad.repositories.CarRepository;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService {
	private CarRepository carRepository;

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return carRepository.findAll();
	}

	@Override
	public Car findById(Long id) {
		// TODO Auto-generated method stub
		
		if(carRepository.findById(id).isPresent()) {
			return carRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public Car findByName(String name) {
		// TODO Auto-generated method stub
		if(carRepository.findByName(name).isPresent()) {
			return carRepository.findByName(name).get();
		}
		return null;
	}

	@Override
	public Car save(Car car) {
		// TODO Auto-generated method stub
		return carRepository.save(car);
	}
	
	public void deleteById(Long id) {
        carRepository.deleteById(id);
    }

}
