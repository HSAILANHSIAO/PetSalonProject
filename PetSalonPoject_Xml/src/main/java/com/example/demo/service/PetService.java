package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Pet;

public interface PetService {
	//create
	void AddPet(Pet e);
	
	//read
	List<Pet> AllPet();
	
	
	//update
	void UpdatePet(Pet e);
	
	//delete
	void DeletePet(int e);
	
	
	
}
