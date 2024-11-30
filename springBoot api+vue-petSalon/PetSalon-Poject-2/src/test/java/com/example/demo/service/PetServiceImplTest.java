package com.example.demo.service;

import org.junit.jupiter.api.Test;
import com.example.demo.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.impl.PetServiceImpl;

@SpringBootTest
public class PetServiceImplTest {
	@Autowired
	PetServiceImpl  petserviceimpl;
	
	//@Test
	public void PetTest()
	{
		petserviceimpl.addPet(new Pet("mukilu","0716",7,"DOG","09122","基隆路四段"));
		
		System.out.println("success");
	}
	
	//@Test
	public void allPetTest()
	{
		//System.out.println(petserviceimpl.allPet());
		for(Pet pet:petserviceimpl.allPet()) {
			System.out.println("編號:"+pet.getId()+"\t名字:"+pet.getName()+"\t出生日:"+pet.getBirthday());
		}
		System.out.println("success");
	}
	
	//@Test
	public void updatePetTest()
	{
		petserviceimpl.updatePet(5, "luka", "09758", "和平北路一段");
		System.out.println("success");
	}
	
	@Test
	public void deletePetTest()
	{
		petserviceimpl.deletePet(11);
		
	}

}
