package com.example.demo.service;


import java.util.List;

import com.example.demo.model.PackageService;


public interface PackageServiceS {
	//create 
	void addPackageService(PackageService p);
	
	//read
	List<PackageService> allPackageservice();
	
	//update
	void updatePackageService(int id,String reservice);
	
	//delete
	void deletePackageService(int id);
	
}
