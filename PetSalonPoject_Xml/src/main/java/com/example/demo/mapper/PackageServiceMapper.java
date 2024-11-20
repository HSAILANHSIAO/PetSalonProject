package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.PackageService;

@Mapper
public interface PackageServiceMapper{
	void addPackageService(PackageService p);
	List<PackageService> selectAll();
	List<PackageService> selectById(int id);
	List<PackageService> selectByIdRange(int start,int end);
	
	@Select ("select * from PackageService")
	List<PackageService> allPackageService();
	
	void update(PackageService p);
	void deleteById(int id);
	
	
	

}
