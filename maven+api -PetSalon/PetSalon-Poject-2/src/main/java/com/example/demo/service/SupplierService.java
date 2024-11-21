package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Supplier;

public interface SupplierService {
	//create
		void addSupplier(Supplier s);
	
	//read
		List<Supplier> allSupplier();
		
	//update
		void updateSupplier(int id,Integer quantity,String sum);
	
	//delete
		void deleteSupplier(int id);
}
