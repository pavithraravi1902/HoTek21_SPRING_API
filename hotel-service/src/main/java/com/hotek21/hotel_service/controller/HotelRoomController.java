package com.hotek21.hotel_service.controller;

import com.hotek21.hotel_service.model.HotelRoom;
import com.hotek21.hotel_service.service.HotelRoomService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotek21/hotel-rooms")
@Tag(name = "Hotel Room API", description = "Endpoints for managing hotel rooms")
public class HotelRoomController {

    @Autowired
    private HotelRoomService service;

    @PostMapping
    public HotelRoom createHotelRoom(@RequestBody HotelRoom room) {
        return service.createHotelRoom(room);
    }

    @PutMapping("/{id}")
    public HotelRoom updateHotelRoom(@PathVariable Long id, @RequestBody HotelRoom room) {
        return service.updateHotelRoom(id, room);
    }

    @DeleteMapping("/{id}")
    public void deleteHotelRoom(@PathVariable Long id) {
        service.deleteHotelRoom(id);
    }

    @GetMapping("/{id}")
    public HotelRoom getHotelRoomById(@PathVariable Long id) {
        return service.getHotelRoomById(id);
    }

    @GetMapping
    public List<HotelRoom> getAllHotelRooms() {
        return service.getAllHotelRooms();
    }
}
