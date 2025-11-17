package com.example.demo.dto;

public class InvoiceDto {

	private int bed_id;
	private int booking_id;
	
	private String name;
	private long finalAmount;
	private long price;
	private int duration;
	
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getBed_id() {
		return bed_id;
	}
	public void setBed_id(int bed_id) {
		this.bed_id = bed_id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(long finalAmount) {
		this.finalAmount = finalAmount;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
	
}
