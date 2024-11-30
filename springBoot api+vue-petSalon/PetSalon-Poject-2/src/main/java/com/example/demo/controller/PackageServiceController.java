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

import com.example.demo.model.PackageService;
import com.example.demo.service.impl.PackageServiceSImpl;

@RestController
@RequestMapping("packageservice")
@CrossOrigin
public class PackageServiceController {
	
	@Autowired
	PackageServiceSImpl packageservicesimpl;
	
	@GetMapping("allPackageservice")
	public List<PackageService> gtoAllPackageService()
	{
		
		return packageservicesimpl.allPackageservice();
		
	}
	
	@PostMapping("addPackageService")
	public String addPackageService(@RequestBody PackageService p)
	{
		packageservicesimpl.addPackageService(p);
		return "新增成功";
		
	}
	
	@PutMapping("updatePackageService/{id}/{reservation}")
	public String updatePackageService(@PathVariable("id")int id,@PathVariable("reservation")String reservation)
	{
		packageservicesimpl.updatePackageService(id, reservation);
		return "修改成功";
	}
	
	@DeleteMapping("daletePackageService/{id}")
	public String deletePackageService(@PathVariable("id") int id)
	{
		packageservicesimpl.deletePackageService(id);
		return "刪除成功";
	}

}
