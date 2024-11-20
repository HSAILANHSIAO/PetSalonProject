package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PackageServiceMapper;
import com.example.demo.model.PackageService;
import com.example.demo.service.PackageServiceS;


@Service
public class PackageServiceSImpl implements PackageServiceS{
	@Autowired
	PackageServiceMapper packageservicemapper;
	

	@Override
	public void AddPackageService(PackageService p) {
		packageservicemapper.addPackageService(p);
		
	}

	@Override
	public List<PackageService> AllPackageService() {
		// TODO Auto-generated method stub
		return packageservicemapper.allPackageService();
	}

	@Override
	public void UpdatePackageService(PackageService p) {
		List<PackageService> l=packageservicemapper.selectById(p.getId());
		//使用輸入的ID調閱 資料
		
		PackageService packageservice=l.get(0);//資料庫的內容
		packageservice.setName(p.getName());
		packageservice.setReservation(p.getReservation());
		
		packageservicemapper.update(packageservice);
		
		
		
	}

	@Override
	public void DeletePackageService(int id) {
		packageservicemapper.deleteById(id);
		
	}

}
