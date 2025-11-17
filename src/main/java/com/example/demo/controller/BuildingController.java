package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.BuildingService;
import com.example.demo.Service.HostelService;
import com.example.demo.dto.BuildingDto;
import com.example.demo.dto.HostelDto;

@RestController
public class BuildingController {
@Autowired
BuildingService buildingService;

	@PostMapping("building")
	String addHostel(@RequestBody BuildingDto hostelDto) {
		buildingService.addBuilding(hostelDto);
		 return "Accepted";
	}
}