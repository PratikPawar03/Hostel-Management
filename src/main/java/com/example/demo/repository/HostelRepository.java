package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entity.Hostel;

public interface HostelRepository extends JpaRepository<Hostel, Integer> {

	@Query(value = """
		    SELECT h.name AS hostel_name, bed.bed_no, bed.status, bed.price
		    FROM hostel h
		    JOIN building b ON b.hostel_id = h.id
		    JOIN floor f ON f.building_id = b.id
		    JOIN room r ON r.floor_id = f.id
		    JOIN bed ON bed.room_id = r.id
		    WHERE bed.status = 'Occupied'
		    """, nativeQuery = true)
		List<Object[]> getOccupiedBedsWithHostel();
		
	//	List getRoomDetailsByHostel(@Param("hostelId") int hostelId);

	
}
