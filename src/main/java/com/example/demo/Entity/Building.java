package com.example.demo.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Building {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String buildingNo;

private int noOfFloors;
private String wadern;


public int getNoOfFloors() {
	return noOfFloors;
}


public void setNoOfFloors(int noOfFloors) {
	this.noOfFloors = noOfFloors;
}


public String getWadern() {
	return wadern;
}


public void setWadern(String wadern) {
	this.wadern = wadern;
}


@OneToMany(mappedBy = "building")
private List<Floor> floor;

public List<Floor> getFloor() {
	return floor;
}


public void setFloor(List<Floor> floor) {
	this.floor = floor;
}


@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "Hostel_Id", referencedColumnName = "id")
private Hostel hostel;

public Hostel getHostel() {
	return hostel;
}


public void setHostel(Hostel hostel) {
	this.hostel = hostel;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getBuildingNo() {
	return buildingNo;
}


public void setBuildingNo(String buildingNo) {
	this.buildingNo = buildingNo;
}






	
}
