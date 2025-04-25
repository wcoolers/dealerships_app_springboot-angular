package com.sheridan.akanbiad.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sheridan.akanbiad.domain.Dealership;

@Service
public interface DealershipService {
	
	public List<Dealership> findAll();
	public Dealership findById(Long id);
	public Dealership findByName(String name);
	public Dealership save(Dealership dealership);

}
