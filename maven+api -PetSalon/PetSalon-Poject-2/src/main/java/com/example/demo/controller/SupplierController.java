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
@RequestMapping("supplier")
@CrossOrigin
public class SupplierController {

	@Autowired
	SupplierServiceImpl supplierserviceimpl;
	
	@GetMapping("allSupplier")
	public List<Supplier> gtoAll()
	{
		return supplierserviceimpl.allSupplier();
	}
	
	@PostMapping("addSupplier")
	public String addSupplier(@RequestBody Supplier s)
	{
		supplierserviceimpl.addSupplier(s);
		return "新增成功";
	}
	
	@PutMapping("updateSupplier/{id}/{quantity}/{sum}")
	public String updateSupplier(@PathVariable("id")int id,@PathVariable("quantity")Integer quantity,@PathVariable("sum")String sum)
	{
		supplierserviceimpl.updateSupplier(id, quantity, sum);
		return "修改成功";
	}
	
	@DeleteMapping("deleteSupplier/{id}")
	public String deleteSupplier(@PathVariable("id")int id)
	{
		supplierserviceimpl.deleteSupplier(id);
		
		return "刪除成功";
	}
	
	
}
