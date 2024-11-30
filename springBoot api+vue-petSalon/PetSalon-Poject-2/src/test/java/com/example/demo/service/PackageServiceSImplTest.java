package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.PackageService;
import com.example.demo.service.impl.PackageServiceSImpl;

@SpringBootTest
public class PackageServiceSImplTest {
	@Autowired
	PackageServiceSImpl packageservicesimpl;
	
	//@Test
	public void PackageServiceTest()
	{
		packageservicesimpl.addPackageService(new PackageService("mika","card","20241210","1535","C.藥浴","095601"));
		
		
		
		System.out.println("success");
		
	}
	
	@Test
	public void findByIdTest()
	{
		//System.out.println(packageservicesimpl.allPackageservice());
		for(PackageService p:packageservicesimpl.allPackageservice())
		{
			System.out.println("id:"+p.getId()+"\treservation:"+p.getReservation());
		}
	}
	
	//@Test
	public void UpdatePackageServiceTest()
	{
		packageservicesimpl.updatePackageService(17, "20241105");
		
		System.out.println("success");
	}
	
	
	
	
	
}
