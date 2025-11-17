package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entity.Bed;
import com.example.demo.dto.BedDto;

public interface BedRepository extends JpaRepository<Bed, Integer> {

	//List<Bed> getVaccantBeds(String status);
	//@Query("SELECT b FROM Bed b  WHERE b.room.sharing = :sharing AND b.room.hostel.id = :hostelId AND b.status = 'Available'")
//	List<Bed> findVaccantBedbySharingAnndHostel(@Param("sharing") int sharing, 
//            @Param("hostel_Id") int hostel_Id);
}
