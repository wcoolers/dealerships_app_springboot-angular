package com.sheridan.akanbiad.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheridan.akanbiad.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	public Optional<Car> findByName(String name);
}
