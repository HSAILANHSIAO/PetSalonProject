package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Supplier;
import com.example.demo.service.impl.SupplierServiceImpl;


@RestController
@CrossOrigin
@RequestMapping("supplier")
public class SupplierController {
	@Autowired
	SupplierServiceImpl supplierserviceimpl;
	
	@GetMapping("AllSupplier")
	public List<Supplier> allSupplier(@RequestBody Supplier s){
		return supplierserviceimpl.AllSuplier();
				
	}
	
	@PostMapping("AddSupplier")
	public String addSupplier(@RequestBody Supplier s) 
	{
		supplierserviceimpl.AddSupplier(s);
		return "建檔成功";
		
	}
	
	@PutMapping("UpdateSupplier")
	public String updatesupplier(@RequestBody Supplier s)
	{
		supplierserviceimpl.UpdateSupplier(s);
		
		return "修改成功";
		
	}
	
	@DeleteMapping("DeleteSupplier/{id}")
	public String delete(@PathVariable("id")int id)
	{
		supplierserviceimpl.DeleteSupplier(id);
		return "刪除成功";
	}
}
