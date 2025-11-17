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
public class Floor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	
private int floorNo;


private int noOfRooms;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="Building_Id", referencedColumnName = "id")
private Building building;

@OneToMany(mappedBy = "floor")
private List<Room> room;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getFloorNo() {
	return floorNo;
}

public void setFloorNo(int floorNo) {
	this.floorNo = floorNo;
}

public int getNoOfRooms() {
	return noOfRooms;
}

public void setNoOfRooms(int noOfRooms) {
	this.noOfRooms = noOfRooms;
}

public Building getBuilding() {
	return building;
}

public void setBuilding(Building building) {
	this.building = building;
}

public List<Room> getRoom() {
	return room;
}

public void setRoom(List<Room> room) {
	this.room = room;
}
	
}
