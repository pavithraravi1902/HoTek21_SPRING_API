package com.hotek21.hotel_service.service.impl;

import com.hotek21.hotel_service.model.HotelRoom;
import com.hotek21.hotel_service.repository.HotelRoomRepository;
import com.hotek21.hotel_service.service.HotelRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelRoomServiceImpl implements HotelRoomService {

    @Autowired
    private HotelRoomRepository repository;

    @Override
    public HotelRoom createHotelRoom(HotelRoom hotelRoom) {
        return repository.save(hotelRoom);
    }

    @Override
    public HotelRoom updateHotelRoom(Long id, HotelRoom hotelRoom) {
        hotelRoom.setId(id);
        return repository.save(hotelRoom);
    }

    @Override
    public void deleteHotelRoom(Long id) {
        repository.deleteById(id);
    }

    @Override
    public HotelRoom getHotelRoomById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<HotelRoom> getAllHotelRooms() {
        return repository.findAll();
    }
}
