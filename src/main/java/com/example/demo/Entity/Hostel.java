package com.example.demo.Entity;

import java.util.List;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Hostel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String address;
private String capacity;
private String contactNo;
private String type;
private String image;
private String website;

public String getContactNo() {
	return contactNo;
}

public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public String getWebsite() {
	return website;
}

public void setWebsite(String website) {
	this.website = website;
}

@OneToMany(mappedBy = "hostel")
private List<Building> building;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCapacity() {
	return capacity;
}

public void setCapacity(String capacity) {
	this.capacity = capacity;
}

public List<Building> getBuilding() {
	return building;
}

public void setBuilding(List<Building> building) {
	this.building = building;
}


	
	
}
