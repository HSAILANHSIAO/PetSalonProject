package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.PackageService;

public interface PackageServiceDao extends JpaRepository<PackageService,Integer>{
	//逆向排序
	
	@Query(value="select * from packageservice order by id desc",nativeQuery=true)
	List<PackageService> queryAll();
	
	PackageService findById(int id);
	
	

}
