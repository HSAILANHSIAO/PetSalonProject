package com.example.demo.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Pet;

@SpringBootTest
public class PetTest {
	@Autowired
	PetMapper petmapper;
	
	//@Test
	public void PetTest()
	{
		//petmapper.addPet(new Pet("luka","0102",8,"DOG","09560","復興北路一號"));
		//System.out.println(petmapper.selectById(3));
		
		System.out.println(petmapper.selectByIdRange(1, 3));
		
		System.out.println("success");
		
	}
	
	//@Test
	public void updateTest()
	{
		List<Pet> l=petmapper.selectById(5);
		Pet e=l.get(0);
		e.setName("yushiki");
		
		petmapper.update(e);
		System.out.println("success");
		
	}
	
	@Test
	public void deleteTest()
	{
		petmapper.deleteById(7);
		
		System.out.println("success");
	}
	
}
