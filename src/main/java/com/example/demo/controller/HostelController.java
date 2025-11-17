package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Hostel;
import com.example.demo.Service.HostelService;
import com.example.demo.dto.HostelDto;

@RestController
public class HostelController {
@Autowired
HostelService hostelService;
	@PostMapping("hostel")
	ResponseEntity addHostel(@RequestBody HostelDto hostelDto) {
		 hostelService.addHostel(hostelDto);
		 return new ResponseEntity(HttpStatus.ACCEPTED);
	}

//	@GetMapping("hostel/room/{hostelId}")
//	public List getRoomDetailsByHostel(@PathVariable int hostelId) {
//		// TODO Auto-generated method stub
//		return hostelService.getRoomDetailsByHostel(hostelId);
//	}
//	
	@GetMapping("hostel/bed")
	public List<Object[]> getOccupiedBedsWithHostel() {
		// TODO Auto-generated method stub
		return hostelService.getOccupiedBedsWithHostel();
	}
	
	@GetMapping("hostels")
	public ResponseEntity getAllHostels() {
		return new ResponseEntity(hostelService.getAllHostel(),HttpStatus.ACCEPTED);
	}

}
