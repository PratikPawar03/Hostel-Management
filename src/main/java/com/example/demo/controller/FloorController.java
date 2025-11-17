package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.FloorService;
import com.example.demo.Service.HostelService;
import com.example.demo.dto.FloorDto;
import com.example.demo.dto.HostelDto;

@RestController
public class FloorController {
@Autowired
FloorService floorService;
	@PostMapping("floor")
	ResponseEntity addfloor(@RequestBody FloorDto floorDto) {
		 floorService.addFloor(floorDto);
		 return new ResponseEntity(HttpStatus.ACCEPTED);
	}
}