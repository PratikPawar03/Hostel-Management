package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Building;
import com.example.demo.Entity.Hostel;
import com.example.demo.dto.HostelDto;
import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.HostelRepository;

@Service
public class HostelServiceImpl implements HostelService {
@Autowired
HostelRepository hostelRepository;

@Autowired
BuildingRepository buildingRepository;
	@Override
	public void addHostel(HostelDto hostelDto) {
		// TODO Auto-generated method stub
	Hostel h1=new Hostel();
	h1.setAddress(hostelDto.getAddress());
	h1.setCapacity(hostelDto.getCapacity());
	h1.setName(hostelDto.getName());
	h1.setImage(hostelDto.getImage());
	h1.setType(hostelDto.getType());
	h1.setWebsite(hostelDto.getWebsite());
	h1.setContactNo(hostelDto.getContactNo());
	hostelRepository.save(h1);
	
	//List<Building> bl= hostelDto.getBuilding(); 
		
//	for(Building b1: bl) {
//		b1.setHostel(h2);
//		buildingRepository.save(b1);
//	}
	}
//	@Override
//	public List getRoomDetailsByHostel(int hostelId) {
//		// TODO Auto-generated method stub
//		return hostelRepository.getRoomDetailsByHostel(hostelId);
//	}
	@Override
	public List<Object[]> getOccupiedBedsWithHostel() {
		// TODO Auto-generated method stub
		return hostelRepository.getOccupiedBedsWithHostel();
	}
	
	public List<Hostel> getAllHostel() {
		return hostelRepository.findAll();
	}

}
