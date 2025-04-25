package com.sheridan.akanbiad.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sheridan.akanbiad.domain.Dealership;
import com.sheridan.akanbiad.repositories.DealershipRepository;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DealershipServiceImpl implements DealershipService {
	private DealershipRepository dealershipRepository;

	@Override
	public List<Dealership> findAll() {
		// TODO Auto-generated method stub
		return dealershipRepository.findAll();
	}

	@Override
	public Dealership findById(Long id) {
		// TODO Auto-generated method stub
		
		if(dealershipRepository.findById(id).isPresent()) {
			return dealershipRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public Dealership findByName(String name) {
		// TODO Auto-generated method stub
		if(dealershipRepository.findByName(name).isPresent()) {
			return dealershipRepository.findByName(name).get();
		}
		return null;
	}

	@Override
	public Dealership save(Dealership dealership) {
		// TODO Auto-generated method stub
		return dealershipRepository.save(dealership);
	}

}
