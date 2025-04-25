package com.sheridan.akanbiad.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheridan.akanbiad.domain.Dealership;

public interface DealershipRepository extends JpaRepository<Dealership, Long> {
	public Optional<Dealership> findByName(String name);
}
