package com.example.demo.dto;

import java.util.List;

import com.example.demo.Entity.Bed;
import com.example.demo.Entity.Floor;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class RoomDto {

	
	private int roomNo;
	

	private String type;

	
	private int fId;
	
	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



	
}
