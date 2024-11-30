package com.example.demo.service;
import java.util.List;

import com.example.demo.model.Pet;


public interface PetService {
		//create
		void addPet(Pet e);
		
	
		//read
		List<Pet> allPet();
	
		//update
		void updatePet(int id,String name,String phone,String address);
	
		//delete
		void deletePet(int id);
}
