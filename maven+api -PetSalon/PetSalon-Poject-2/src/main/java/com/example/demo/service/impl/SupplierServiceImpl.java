package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SupplierDao;
import com.example.demo.model.Supplier;
import com.example.demo.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService{
	@Autowired
	SupplierDao supplierdao;
	
	
	@Override
	public void addSupplier(Supplier s) {
		supplierdao.save(s);
		
	}

	@Override
	public List<Supplier> allSupplier() {
		// TODO Auto-generated method stub
		return supplierdao.queryAll();
	}

	@Override
	public void updateSupplier(int id,Integer quantity,String sum) {
		Supplier s=supplierdao.findById(id);
		s.setQuantity(quantity);
		s.setSum(sum);
		
		supplierdao.save(s);
		
	}

	@Override
	public void deleteSupplier(int id) {
		supplierdao.deleteById(id);
		
	}

}
