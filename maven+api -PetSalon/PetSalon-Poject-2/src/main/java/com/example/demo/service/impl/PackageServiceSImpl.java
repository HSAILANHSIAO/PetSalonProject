package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PackageServiceDao;
import com.example.demo.model.PackageService;
import com.example.demo.service.PackageServiceS;


@Service
public class PackageServiceSImpl implements PackageServiceS{
	@Autowired
	PackageServiceDao packageservicedao;

	@Override
	public void addPackageService(PackageService p) {
		packageservicedao.save(p);
		
	}

	@Override
	public List<PackageService> allPackageservice() {
		// TODO Auto-generated method stub
		return packageservicedao.queryAll();
	}

	@Override
	public void updatePackageService(int id, String reservice) {
		PackageService p=packageservicedao.findById(id);
		
		p.setReservation(reservice);
		
		packageservicedao.save(p);
	}

	@Override
	public void deletePackageService(int id) {
		packageservicedao.deleteById(id);
		
	}
	
	

	

}
