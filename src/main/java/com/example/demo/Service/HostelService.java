package com.example.demo.Service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.example.demo.Entity.Hostel;
import com.example.demo.dto.HostelDto;

public interface HostelService {
void addHostel(HostelDto hostelDto);
//List getRoomDetailsByHostel(@Param("hostelId") int hostelId);
List<Object[]> getOccupiedBedsWithHostel();
List<Hostel> getAllHostel();
List<Integer> getSharingTypes(@Param("hostelId") int hostelId);
}
