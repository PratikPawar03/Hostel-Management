
package com.example.demo.Entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Room {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int roomNo;
private int sharing;

private String type;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "Floor_Id", referencedColumnName = "id")
private Floor floor;

@OneToMany(mappedBy = "room")
private List<Bed> bed;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getRoomNo() {
	return roomNo;
}

public void setRoomNo(int roomNo) {
	this.roomNo = roomNo;
}

public int getSharing() {
	return sharing;
}

public void setSharing(int sharing) {
	this.sharing = sharing;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public Floor getFloor() {
	return floor;
}

public void setFloor(Floor floor) {
	this.floor = floor;
}

public List<Bed> getBed() {
	return bed;
}

public void setBed(List<Bed> bed) {
	this.bed = bed;
}



//private List<Bed> bed;

}