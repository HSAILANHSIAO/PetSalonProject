package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Pet;

@Mapper
public interface PetMapper {
	void addPet(Pet e);
	
	List<Pet> selectAll();
	List<Pet> selectById(int id);
	List<Pet> selectByIdRange(int start,int end);
	
	@Select ("Select * from Pet")
	List<Pet> allPet();
	
	void update(Pet e);
	
	void deleteById(int id);
	
	
}
