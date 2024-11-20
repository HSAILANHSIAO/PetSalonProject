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
@CrossOrigin
@RequestMapping("PackageService")
public class PackageServiceController {
	@Autowired
	PackageServiceSImpl packageservicesimpl;
	
	@GetMapping("AllPackageService")
	public List<PackageService> allPackageService(){
		return packageservicesimpl.AllPackageService();
	}
	
	@PostMapping("AddPackageSerivce")
	public String addPackageService(@RequestBody PackageService p)
	{
		packageservicesimpl.AddPackageService(p);
		
		return "建檔成功";
		
	}
	
	@PutMapping("UpdatePackageService")
	public String UpdatePackageService(@RequestBody PackageService p)
	{
		packageservicesimpl.UpdatePackageService(p);
		
		return "修改成功";
		
	}
	
	
	@DeleteMapping("DeletePackageService/{id}")
	public String delete(@PathVariable("id")int id)
	{
		
		packageservicesimpl.DeletePackageService(id);
		
		return "刪除成功";
	}
	
	

}
