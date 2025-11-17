package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Bed;
import com.example.demo.Entity.Building;
import com.example.demo.Entity.Floor;
import com.example.demo.Entity.Room;
import com.example.demo.dto.AddBedDto;
import com.example.demo.dto.BedDto;
import com.example.demo.repository.BedRepository;
import com.example.demo.repository.RoomRespository;

@Service
public class BedServiceImpl implements BedService {
	
@Autowired
BedRepository bedRepository;

@Autowired
RoomRespository roomRespository;


	@Override
	public void addBed(AddBedDto addBedDto) {
		// TODO Auto-generated method stub
		Bed b=new Bed();
		b.setBedNo(addBedDto.getBedNo());
		Room r= roomRespository.findById(addBedDto.getRoomId()).get();
		r.setSharing(r.getSharing()+1);
		b.setRoom(r);
		b.setStatus("Available");
		bedRepository.save(b);
	}

	@Override
	public List<BedDto> findVaccantBeds(String status) {
		// TODO Auto-generated method stub
		List<Bed>  bedList= bedRepository.findAll();
		List<BedDto> vaccantBeds=new ArrayList<>();
		if(status.equals("Available")) {
			for(Bed b:bedList) {
				BedDto bedDto=new BedDto();
				Room room=b.getRoom();
				Floor floor=room.getFloor();
				Building building=floor.getBuilding();
				bedDto.setBedNo(b.getBedNo());
				bedDto.setRoomNo(room.getRoomNo());
				bedDto.setFloorNo(floor.getFloorNo());
				bedDto.setBuildingNo(building.getBuildingNo());
				bedDto.setHostelName(building.getHostel().getName());
				vaccantBeds.add(bedDto);
				}
			
		}
		return vaccantBeds;
	}

//	@Override
//	public List<BedDto> findVaccantBedbySharingAnndHostel(int sharing, int hostel_id) {
//		// TODO Auto-generated method stub
//		List<Bed>  bedList= bedRepository.findVaccantBedbySharingAnndHostel(sharing, hostel_id);
//		List<BedDto> vaccantBeds=new ArrayList<>();
//
//		for(Bed b:bedList) {
//				BedDto bedDto=new BedDto();
//				Room room=b.getRoom();
//				Floor floor=room.getFloor();
//				Building building=floor.getBuilding();
//				bedDto.setBedNo(b.getBedNo());
//				bedDto.setRoomNo(room.getRoomNo());
//				bedDto.setFloorNo(floor.getFloorNo());
//				bedDto.setBuildingNo(building.getBuildingNo());
//				bedDto.setHostelName(building.getHostel().getName());
//				vaccantBeds.add(bedDto);
//				}
//			
//		
//		return vaccantBeds;
//	}



}
