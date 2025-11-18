package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Bed;
import com.example.demo.Entity.Booking;
import com.example.demo.Entity.User;
import com.example.demo.dto.BookingDto;
import com.example.demo.dto.InvoiceDto;
import com.example.demo.repository.BedRepository;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.UserRepository;

@Service
public class BookingServiceImpl implements BookingService{
@Autowired
BookingRepository bookingRepository;

@Autowired
BedRepository bedRepository;

@Autowired
UserRepository userRepository;

	@Override
	public void bookBed(BookingDto bookingDto, int user_id, int bed_id) {
		// TODO Auto-generated method stub
		Booking booking=new Booking();
		
		booking.setBed_Id(bed_id);
		booking.setUser_Id(user_id);
		booking.setDate(bookingDto.getDate());
		booking.setTranx_id(bookingDto.getTranx_id());
		booking.setPaymentSatus(bookingDto.getPaymentStatus());
		booking.setStaus(bookingDto.getStaus());
		
		if(booking.getPaymentSatus().equals("Complete")) {
			User user=userRepository.findById(user_id).get();
			user.setBed_id(bed_id);
			
			Bed bed=bedRepository.findById(bed_id).get();
			bed.setStatus("Occupied");
		}
		bookingRepository.save(booking);
	}
	@Override
	public InvoiceDto getInvoice(int booking_id,int bed_id, int duration) {
		// TODO Auto-generated method stub
		InvoiceDto invoiceDto=new InvoiceDto();
		Booking booking=bookingRepository.findById(booking_id).get();
		
		Bed b=bedRepository.findById(bed_id).get();
		invoiceDto.setBed_id(bed_id);
		invoiceDto.setDuration(duration);
		long finalAmount=(b.getPrice())*duration;
		invoiceDto.setPrice(b.getPrice());
		invoiceDto.setFinalAmount(finalAmount);
		invoiceDto.setName(userRepository.findById(booking.getUser_Id()).get().getName());
		invoiceDto.setBooking_id(booking_id);
		
		return invoiceDto;
		
		
		
	}

	
	
}
