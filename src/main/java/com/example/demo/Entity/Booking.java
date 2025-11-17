package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int user_Id;
	private int bed_Id;
	private int tranx_id;
	private String staus;
	private String date;
	private String paymentSatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public int getBed_Id() {
		return bed_Id;
	}
	public void setBed_Id(int bed_Id) {
		this.bed_Id = bed_Id;
	}
	public int getTranx_id() {
		return tranx_id;
	}
	public void setTranx_id(int tranx_id) {
		this.tranx_id = tranx_id;
	}
	public String getStaus() {
		return staus;
	}
	public void setStaus(String staus) {
		this.staus = staus;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPaymentSatus() {
		return paymentSatus;
	}
	public void setPaymentSatus(String paymentSatus) {
		this.paymentSatus = paymentSatus;
	}
	
	
	
	
	
}
