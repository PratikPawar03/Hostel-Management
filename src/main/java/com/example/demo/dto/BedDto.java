package com.example.demo.dto;

import com.example.demo.Entity.Hostel;

public class BedDto {

	private int roomNo;
	private int bedNo;
	
	private int floorNo;
	private String buildingNo;
	private String hostelName;
	
	
	public int getBedNo() {
		return bedNo;
	}
	public void setBedNo(int bedNo) {
		this.bedNo = bedNo;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	
	
	
}
