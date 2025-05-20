package com.hotek21.booking_service.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "booking_no", nullable = false, unique = true)
    private Long bookingNo;

    @Column(name = "guest_id", nullable = false)
    private Long guestId;

    @Column(name = "total_charges", nullable = false)
    private BigDecimal totalCharges;

    @Column(name = "tax", nullable = false)
    private BigDecimal tax;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "check_in_date", nullable = false)
    private LocalDate checkInDate;

    @Column(name = "check_out_date", nullable = false)
    private LocalDate checkOutDate;

    @Column(name = "paid", nullable = false)
    @Enumerated(EnumType.STRING)
    private PaidStatus paid;

    public enum PaidStatus {
        Y, N
    }
}
