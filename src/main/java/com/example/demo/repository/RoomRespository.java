package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entity.Room;

public interface RoomRespository extends JpaRepository<Room, Integer> {
	

	@Query("SELECT DISTINCT r.sharing FROM Room r  WHERE r.floor.building.hostel.id = :hostelId")
	    List<Integer> getSharingTypes(@Param("hostelId") int hostelId);
	
}
