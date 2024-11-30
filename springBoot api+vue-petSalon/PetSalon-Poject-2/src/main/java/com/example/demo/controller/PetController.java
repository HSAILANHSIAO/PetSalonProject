package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pet;

import com.example.demo.service.impl.PetServiceImpl;



@RestController
@RequestMapping("pet")
@CrossOrigin
public class PetController {
	
	@Autowired
	PetServiceImpl petserviceimpl;
	
	@GetMapping("AllPet")
	public List<Pet> gtoAllPet()
	{
		return petserviceimpl.allPet();
	}
	
	@PostMapping("AddPet")
	public String addPet(@RequestBody Pet p)
	{
		petserviceimpl.addPet(p);
		return "建檔成功";
	}
	
	@PutMapping("UpdatePet/{id}/{name}/{phone}/{address}")
	public String updatePet(@PathVariable("id")int id,@PathVariable ("name") String name, 
							@PathVariable("phone")String phone, @PathVariable("address")String address)
	{
		petserviceimpl.updatePet(id, name, phone, address);
		return "修改成功";
	}
	
	@DeleteMapping("DeletePet/{id}")
	public String deletePet(@PathVariable("id")int id)
	{
		petserviceimpl.deletePet(id);
		return "刪除成功";
	}
	
}
