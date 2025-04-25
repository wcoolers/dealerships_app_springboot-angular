package com.sheridan.akanbiad.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sheridan.akanbiad.domain.Car;

@Service
public interface CarService {
	
	public List<Car> findAll();
	public Car findById(Long id);
	public Car findByName(String name);
	public void deleteById(Long id);
	public Car save(Car car);

}
