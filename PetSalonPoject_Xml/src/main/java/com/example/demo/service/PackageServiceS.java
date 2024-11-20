package com.example.demo.service;

import java.util.List;

import com.example.demo.model.PackageService;

public interface PackageServiceS {
	//create
	void AddPackageService(PackageService p);
	
	//read
	List<PackageService> AllPackageService();
	
	//update
	void UpdatePackageService(PackageService p);
	
	//delete
	void DeletePackageService(int id);
	
	
}
