package com.hotek21.guest_service.service.impl;

import com.hotek21.guest_service.model.Guest;
import com.hotek21.guest_service.repository.GuestRepository;
import com.hotek21.guest_service.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public Guest createGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public Guest getGuestById(Long id) {
        return guestRepository.findById(id).orElseThrow(() -> new RuntimeException("Guest not found"));
    }

    @Override
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @Override
    public Guest updateGuest(Long id, Guest guest) {
        Guest existingGuest = getGuestById(id);
        existingGuest.setFirstName(guest.getFirstName());
        existingGuest.setLastName(guest.getLastName());
        existingGuest.setSex(guest.getSex());
        existingGuest.setDob(guest.getDob());
        existingGuest.setEmailId(guest.getEmailId());
        existingGuest.setPassword(guest.getPassword());
        existingGuest.setStatus(guest.getStatus());
        return guestRepository.save(existingGuest);
    }

    @Override
    public void deleteGuest(Long id) {
        guestRepository.deleteById(id);
    }
}
