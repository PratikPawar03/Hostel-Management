package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.BedService;
import com.example.demo.Service.BedServiceImpl;
import com.example.demo.dto.AddBedDto;
import com.example.demo.dto.BedDto;

@RestController
public class BedController {

	
	@Autowired
	BedService bedService;


	@PostMapping("bed")
	ResponseEntity addBed(@RequestBody AddBedDto addBedDto) {
		bedService.addBed(addBedDto);
		return new ResponseEntity(HttpStatus.ACCEPTED);
	}
	
	@GetMapping("bed/{status}")
		ResponseEntity vaccantBed(@RequestBody BedDto bedDto, @PathVariable String status) {
		return new ResponseEntity(bedService.findVaccantBeds(status),HttpStatus.ACCEPTED);
		
		
	}
	
//	@GetMapping("bed/{sharing/hostel_id}")
//	ResponseEntity getVaccantBedBySharingAndHostel(int sharing, int hostel_id) {
//		return new ResponseEntity(bedService.findVaccantBedbySharingAnndHostel(sharing, hostel_id), HttpStatus.ACCEPTED);
//	}
	
	
}
