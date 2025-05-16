package com.hotek21.hotel_service.service;

import com.hotek21.hotel_service.model.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {
    Hotel createHotel(Hotel hotel);
    Optional<Hotel> getHotelById(Long id);
    List<Hotel> getAllHotels();
    Hotel updateHotel(Long id, Hotel hotel);
    void deleteHotel(Long id);
}
