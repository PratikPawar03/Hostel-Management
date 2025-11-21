package com.example.demo.dto;

public class BookingDto {
	
	
	private int user_Id;
	private int bed_Id;
	private int tranx_id;
	private String staus;
	private String date;
	private String paymentStatus;
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
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentSatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
}
