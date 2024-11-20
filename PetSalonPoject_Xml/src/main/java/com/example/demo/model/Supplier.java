package com.example.demo.model;

public class Supplier {
	private Integer id;
	private String phone;
	private String name;
	private String price;
	private Integer quantity;
	private String sum;
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Supplier(String phone, String name, String price, Integer quantity, String sum) {
		super();
		this.phone = phone;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.sum = sum;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	
	
	
}
