package com.ahmed.adel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ahmed.adel.model.AuthenticationRequest;

public interface RequestRepository extends JpaRepository<AuthenticationRequest, Integer> {
	
	
	//Optional<AuthenticationRequest> findById(int id);
	Optional<AuthenticationRequest> findByUserName(String userName);

}
