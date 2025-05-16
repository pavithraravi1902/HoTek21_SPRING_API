package com.hotek21.hotel_service.repository;

import com.hotek21.hotel_service.model.HotelRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRoomRepository extends JpaRepository<HotelRoom, Long> {
}
