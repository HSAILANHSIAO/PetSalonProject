package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PetDao;
import com.example.demo.model.Pet;
import com.example.demo.service.PetService;


@Service
public class PetServiceImpl implements PetService{
	@Autowired
	PetDao petdao;


	@Override
	public void addPet(Pet e) {
		petdao.save(e);
		
	}

	@Override
	public List<Pet> allPet() {
		// TODO Auto-generated method stub
		return petdao.queryAll();
	}

	@Override
	public void updatePet(int id, String name, String phone, String address) {
		Pet pet=petdao.findById(id);
		pet.setName(name);
		pet.setPhone(phone);
		pet.setAddress(address);
		
		petdao.save(pet);
		
	}

	@Override
	public void deletePet(int id) {
		petdao.deleteById(id);
		
	}
	

}
