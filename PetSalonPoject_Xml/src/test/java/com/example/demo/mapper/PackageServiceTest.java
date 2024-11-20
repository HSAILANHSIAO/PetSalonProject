package com.example.demo.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.PackageService;




@SpringBootTest
public class PackageServiceTest {

	@Autowired
	PackageServiceMapper packageservicemapper;
	
	//@Test
	public void PaclageSerivceTest()
	{
		//System.out.println(packageservicemapper.selectAll());
		packageservicemapper.addPackageService(new PackageService("luka","cash","20241117","1220","C.藥浴","09560"));
		//System.out.println(packageservicemapper.selectById(3));
		//System.out.println(packageservicemapper.selectByIdRange(1,4));
		
		
		//System.out.println("success");
		
		
	}
	
	//@Test
	public void updateTest()
	{
		List<PackageService> l=packageservicemapper.selectById(8);
		PackageService p=l.get(0);
		
		p.setName("yuki");
		p.setPayer("pay_by_card");
		p.setReservation("20241230");
		p.setTime("0925");
		p.setSalon("B.剃毛");
		p.setPhone("09152");
		
		
		packageservicemapper.update(p);
		System.out.println("success");
	}   
	
	@Test 
	public void deleteTest()
	{
		packageservicemapper.deleteById(6);
		System.out.println("success");
	}
	
	
}
