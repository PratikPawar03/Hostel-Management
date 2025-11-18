package com.example.demo.Service;

import com.example.demo.Entity.Booking;
import com.example.demo.dto.BookingDto;
import com.example.demo.dto.InvoiceDto;

public interface BookingService {

	void bookBed(BookingDto bookingDto, int user_id, int bed_id);
	InvoiceDto getInvoice(int booking_id,int bed_id, int duration);
}
