package com.hotek21.guest_service.service;

import com.hotek21.guest_service.model.Guest;

import java.util.List;

public interface GuestService {
    Guest createGuest(Guest guest);
    Guest getGuestById(Long id);
    List<Guest> getAllGuests();
    Guest updateGuest(Long id, Guest guest);
    void deleteGuest(Long id);
}
