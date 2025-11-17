package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Room;

public interface RoomRespository extends JpaRepository<Room, Integer> {

}
