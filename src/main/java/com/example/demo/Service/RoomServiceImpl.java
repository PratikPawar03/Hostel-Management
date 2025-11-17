package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Bed;
import com.example.demo.Entity.Floor;
import com.example.demo.Entity.Room;
import com.example.demo.controller.HostelController;
import com.example.demo.dto.RoomDto;
import com.example.demo.repository.BedRepository;
import com.example.demo.repository.FloorRepository;
import com.example.demo.repository.RoomRespository;

@Service
public class RoomServiceImpl implements RoomService {
	@Autowired
	RoomRespository roomRespository;

	@Autowired
	BedRepository bedRepository;
	@Autowired
	FloorRepository floorRepository;
	
	@Override
public void addRoom(RoomDto roomDto) {

		Room r1=new Room();
		r1.setRoomNo(roomDto.getRoomNo());
		r1.setType(roomDto.getType());
		
		Floor f= floorRepository.findById(roomDto.getfId()).get();
		r1.setFloor(f);
		f.setNoOfRooms(f.getNoOfRooms()+1);
		 roomRespository.save(r1);

//		for(Bed b: beds) {
//			b.setRoom(r2);
//			bedRepository.save(b);
//		}
	}

}
