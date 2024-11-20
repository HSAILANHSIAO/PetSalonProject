package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.SupplierMapper;
import com.example.demo.model.Supplier;
import com.example.demo.service.SupplierService;


@Service
public class SupplierServiceImpl implements SupplierService{
	@Autowired
	SupplierMapper suppliermapper;
	

	@Override
	public void SddSupplier(Supplier s) {
		suppliermapper.addSupplier(s);
		
	}

	@Override
	public List<Supplier> AllSuplier() {
		// TODO Auto-generated method stub
		return suppliermapper.allSupplier();
	}

	@Override
	public void UpdateSupplier(Supplier s) {
		suppliermapper.update(s);
		
	}

	@Override
	public void DeleteSupplier(int id) {
		suppliermapper.deleteById(id);
		
	}

}
