package com.example.demo.dto;

import java.util.List;

import com.example.demo.Entity.Floor;
import com.example.demo.Entity.Hostel;

import jakarta.persistence.OneToMany;

public class BuildingDto {
	private String buildingNo;
	private int noOfFloors;
	private String wadern;
	private int hId;
	
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


	


	//private List<Floor> floor;
	
	public int gethId() {
		return hId;
	}


	public void sethId(int hId) {
		this.hId = hId;
	}


	public String getBuildingNo() {
		return buildingNo;
	}


	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}


	
	
}
