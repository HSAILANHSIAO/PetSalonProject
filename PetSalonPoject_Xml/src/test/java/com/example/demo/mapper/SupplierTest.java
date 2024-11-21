package com.example.demo.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Supplier;


@SpringBootTest
public class SupplierTest {
	@Autowired
	SupplierMapper suppliermapper;
	
	
	@Test
	public void SuplierTest() {
		
		suppliermapper.addSupplier(new Supplier("09568","狗牌飼料","320",1,"320"));
		
		//System.out.println(suppliermapper.selectById(1));
		
		//System.out.println(suppliermapper.selectByIdRange(2,3));
		
		//System.out.println(suppliermapper.selectAll());
		System.out.println("success");
	}
	
	//@Test
	public void updateTest()
	{
		
		List<Supplier> l=suppliermapper.selectById(1);
		Supplier s=l.get(0);
		
		s.setPhone("09560");
		s.setName("貓牌飼料");
		s.setQuantity(1);
		s.setSum("230");
		
		suppliermapper.update(s);
		
		System.out.println("success");
	}
	
	
	//@Test
	public void deleteTest()
	{
		suppliermapper.deleteById(3);
		System.out.println("success");
	}
}
