package com.hotek21.hotel_service.service;

import com.hotek21.hotel_service.model.HotelRoom;

import java.util.List;

public interface HotelRoomService {
    HotelRoom createHotelRoom(HotelRoom hotelRoom);
    HotelRoom updateHotelRoom(Long id, HotelRoom hotelRoom);
    void deleteHotelRoom(Long id);
    HotelRoom getHotelRoomById(Long id);
    List<HotelRoom> getAllHotelRooms();
}
