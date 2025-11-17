package com.example.demo.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Bed {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int bedNo;
public Room getRoom() {
	return room;
}

private String status;
private long price;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "Room_ID", referencedColumnName = "id")
private Room room;

public void setRoom(Room room) {
	this.room = room;
}


public int getBedNo() {
	return bedNo;
}

public void setBedNo(int bedNo) {
	this.bedNo = bedNo;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public long getPrice() {
	return price;
}

public void setPrice(long price) {
	this.price = price;
}

	
}
