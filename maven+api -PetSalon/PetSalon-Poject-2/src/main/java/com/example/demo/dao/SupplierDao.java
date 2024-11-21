package com.example.demo.dao;

import java.util.List;
import com.example.demo.model.Supplier;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SupplierDao extends JpaRepository<Supplier,Integer>{
		//逆向排序
		@Query(value="select * from supplier order by id desc",nativeQuery=true)
		List<Supplier> queryAll();
		
		Supplier findById(int id);

		
	
}
