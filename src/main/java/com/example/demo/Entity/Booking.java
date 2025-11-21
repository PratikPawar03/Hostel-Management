package com.example.demo.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName = "id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bed_id", referencedColumnName = "id")
	private Bed bed;
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
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Bed getBed() {
		return bed;
	}
	public void setBed(Bed bed) {
		this.bed = bed;
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
