package com.example.demo.controller;
import com.example.demo.Service.UserServiceImpl;
import com.example.demo.dto.UserDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
public class UserController {


	@Autowired
	UserService userService;


	
	@PostMapping("user")
	ResponseEntity addUser(@RequestBody UserDto userDto){
		userService.addUser(userDto);
		return new ResponseEntity(HttpStatus.ACCEPTED);
	}
	
}
