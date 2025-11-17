package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Building;
import com.example.demo.Entity.Floor;
import com.example.demo.Entity.Hostel;
import com.example.demo.dto.BuildingDto;
import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.FloorRepository;
import com.example.demo.repository.HostelRepository;

@Service
public class BuildingServiceImpl implements BuildingService{
@Autowired
BuildingRepository buildingRepository;

@Autowired
FloorRepository floorRepository;

@Autowired
HostelRepository hostelRepository;
	@Override
	public void addBuilding(BuildingDto buildingDto) {
		// TODO Auto-generated method stub
		Building b1=new Building();
		b1.setBuildingNo(buildingDto.getBuildingNo());
		b1.setNoOfFloors(buildingDto.getNoOfFloors());
		b1.setWadern(buildingDto.getWadern());
		
		Hostel h=hostelRepository.findById(buildingDto.gethId()).get();
		b1.setHostel(h);
		buildingRepository.save(b1);
//		List<Floor> floors=buildingDto.getFloor();
//		
//		for(Floor f:floors) {
//			f.setBuilding(b2);
//			floorRepository.save(f);
//		}
		
		
	}

}
