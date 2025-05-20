package com.hotek21.booking_service.repository;

import com.hotek21.booking_service.model.Booking;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findByBookingNo(Long bookingNo);
}
