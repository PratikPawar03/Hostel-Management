package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Booking;
import com.example.demo.Service.BookingService;
import com.example.demo.dto.BookingDto;

@RestController
public class BookingController {
@Autowired
BookingService bookingService;


@PostMapping("booking/{user_id}/{bed_id}")
ResponseEntity bookBed(@RequestBody BookingDto bookingDto,@PathVariable int user_id,@PathVariable int bed_id) {
	bookingService.bookBed(bookingDto, user_id, bed_id);
	return new ResponseEntity(HttpStatus.ACCEPTED);
}

@GetMapping("invoice/{booking_id}/{bed_id}/{duration}")
ResponseEntity getInvoice(@PathVariable int booking_id, @PathVariable int bed_id,@PathVariable int duration) {
	
	return new ResponseEntity(bookingService.getInvoice(booking_id, bed_id, duration),HttpStatus.ACCEPTED);
}
	
	
}
