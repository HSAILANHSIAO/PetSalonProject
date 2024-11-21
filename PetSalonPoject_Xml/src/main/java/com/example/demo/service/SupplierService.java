package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Supplier;

public interface SupplierService {
		//create
		void AddSupplier(Supplier s);
		
	
		
		//read
		List<Supplier> AllSuplier();
	
		
		//update
		void UpdateSupplier(Supplier s);
		
	
		//delete
		void DeleteSupplier(int id);

}	
