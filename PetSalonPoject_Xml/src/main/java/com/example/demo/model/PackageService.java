package com.example.demo.model;

public class PackageService {
	private Integer id;
	private String name;
	private String payer;
	private String reservation;
	private String time;
	private String salon;
	private String phone;
	public PackageService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PackageService(String name, String payer, String reservation, String time, String salon, String phone) {
		super();
		this.name = name;
		this.payer = payer;
		this.reservation = reservation;
		this.time = time;
		this.salon = salon;
		this.phone = phone;
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
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public String getReservation() {
		return reservation;
	}
	public void setReservation(String reservation) {
		this.reservation = reservation;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSalon() {
		return salon;
	}
	public void setSalon(String salon) {
		this.salon = salon;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
}
