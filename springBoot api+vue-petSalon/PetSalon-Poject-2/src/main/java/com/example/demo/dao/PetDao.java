package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Pet;
import java.util.List;

public interface PetDao extends JpaRepository<Pet,Integer>{
	//逆向排序
	@Query(value="select * from pet order by id desc",nativeQuery=true)
	List<Pet> queryAll();
	
	Pet findById(int id);

	

}
