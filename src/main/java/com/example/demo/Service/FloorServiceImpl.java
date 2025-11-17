package com.example.demo.Service;

import java.util.List;
import com.example.demo.repository.RoomRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Building;
import com.example.demo.Entity.Floor;
import com.example.demo.Entity.Room;
import com.example.demo.dto.FloorDto;
import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.FloorRepository;

@Service
public class FloorServiceImpl implements FloorService {

	@Autowired
	FloorRepository floorRepository;
	
	@Autowired
	RoomRespository roomRespository;
	
	@Autowired
	BuildingRepository buildingRepository;

	@Override
	public void addFloor(FloorDto floorDto) {
		// TODO Auto-generated method stub
		
		Floor f1=new Floor();
		f1.setFloorNo(floorDto.getFloorNo());
	
		Building b=buildingRepository.findById(floorDto.getbId()).get();
		b.setNoOfFloors(b.getNoOfFloors()+1);
		f1.setBuilding(b);
		floorRepository.save(f1);
//		List<Room> rs= floorDto.getRoom();
//		for(Room r: rs) {
//			r.setFloor(f2);
//			roomRespository.save(r);
//		}
	}

}
