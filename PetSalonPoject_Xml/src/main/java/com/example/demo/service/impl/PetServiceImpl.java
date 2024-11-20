package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PetMapper;
import com.example.demo.model.Pet;
import com.example.demo.service.PetService;


@Service
public class PetServiceImpl implements PetService{
	@Autowired
	PetMapper petmapper;

	@Override
	public void AddPet(Pet e) {
		petmapper.addPet(e);
		
	}

	@Override
	public List<Pet> AllPet() {
		// TODO Auto-generated method stub
		return petmapper.allPet();
	}

	@Override
	public void UpdatePet(Pet e) {
		petmapper.update(e);
		
	}

	@Override
	public void DeletePet(int e) {
		petmapper.deleteById(e);
		
	}

}
