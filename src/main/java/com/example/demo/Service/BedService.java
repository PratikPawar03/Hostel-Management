package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Bed;
import com.example.demo.dto.AddBedDto;
import com.example.demo.dto.BedDto;

public interface BedService {
void addBed(AddBedDto addBedDto);
List<BedDto> findVaccantBeds(String status);

//List<BedDto> findVaccantBedbySharingAnndHostel(int sharing,int hostel_id);

}
