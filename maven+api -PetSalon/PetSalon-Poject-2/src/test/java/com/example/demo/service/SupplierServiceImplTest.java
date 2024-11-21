package com.example.demo.service;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Supplier;
import com.example.demo.service.impl.SupplierServiceImpl;

@SpringBootTest
public class SupplierServiceImplTest {
	
	@Autowired
	SupplierServiceImpl supplierserviceimpl;
	
	//@Test
	public void SupplierTest()
	{
		supplierserviceimpl.addSupplier(new Supplier("09880","狗牌飼料","230",1,"230"));
		
		
		System.out.println("success");
	}
	
	//@Test
	public void findByIdTest()
	{
		/*for(Supplier s:supplierserviceimpl.allSupplier())
		{
			//System.out.println("id:"+s.getId()+"\tquantity:"+s.getQuantity());
			
			System.out.println("success");
		}*/
		
		System.out.println(supplierserviceimpl.allSupplier());
		System.out.println("success");
	}
	
	//@Test
	public void updateSupplier()
	{
		supplierserviceimpl.updateSupplier(6, 1,"230");
		System.out.println("success");
	}
	
	@Test
	public void deleteSupplier()
	{
		supplierserviceimpl.deleteSupplier(6);
		System.out.println("success");
	}
	
	
	

}
