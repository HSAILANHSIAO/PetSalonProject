package com.example.demo.model;

public class Pet {
	private Integer id;
	private String name;
	private String birthday;
	private Integer weigh;
	private String sort;
	private String phone;
	private String address;
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(String name, String birthday, Integer weigh, String sort, String phone, String address) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.weigh = weigh;
		this.sort = sort;
		this.phone = phone;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Integer getWeigh() {
		return weigh;
	}
	public void setWeigh(Integer weigh) {
		this.weigh = weigh;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
