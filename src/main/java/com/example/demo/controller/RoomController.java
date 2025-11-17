package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.HostelService;
import com.example.demo.Service.RoomService;
import com.example.demo.dto.HostelDto;
import com.example.demo.dto.RoomDto;

@RestController
public class RoomController {
@Autowired
RoomService roomService;
	@PostMapping("room")
	ResponseEntity addHostel(@RequestBody RoomDto roomDto) {
		 roomService.addRoom(roomDto);
		 return new ResponseEntity(HttpStatus.ACCEPTED);
	}
}
