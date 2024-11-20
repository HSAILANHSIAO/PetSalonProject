package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Supplier;

@Mapper
public interface SupplierMapper {
	void addSupplier(Supplier s);
	
	List<Supplier> selectAll();
	List<Supplier> selectById(int id);
	List<Supplier> selectByIdRange(int start,int end);
	
	
	@Select("select * from Supplier")
	List<Supplier> allSupplier();
	
	void update(Supplier s);
	
	void deleteById(int id);
	
}
