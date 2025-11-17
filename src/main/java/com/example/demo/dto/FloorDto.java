package com.example.demo.dto;

import java.util.List;

import com.example.demo.Entity.Building;
import com.example.demo.Entity.Room;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class FloorDto {
	private int floorNo;

	private int bId;

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}



}
