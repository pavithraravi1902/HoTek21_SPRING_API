package com.hotek21.hotel_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Table(name = "hotel_availability")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier for hotel availability", example = "1", required = true)
    private Long id;

    @Column(name = "hotel_room_id", nullable = false, unique = true)
    @Schema(description = "ID of the associated hotel room", example = "1", required = true)
    private Long hotelRoomId;

    @Column(name = "check_in_time", nullable = false)
    @Schema(description = "Check-in time", example = "14:00:00", required = true)
    private LocalTime checkInTime;

    @Column(name = "check_out_time", nullable = false)
    @Schema(description = "Check-out time", example = "12:00:00", required = true)
    private LocalTime checkOutTime;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Schema(description = "Whether the room is bookable", example = "Y", required = true)
    private Bookable bookable;

    @Column(name = "category_id", nullable = false)
    @Schema(description = "ID of the associated category", example = "1", required = true)
    private Long categoryId;

    @Column(name = "hotel_id", nullable = false)
    @Schema(description = "ID of the associated hotel", example = "1", required = true)
    private Long hotelId;

    public enum Bookable {
        @Schema(description = "Room is bookable")
        Y,
        @Schema(description = "Room is not bookable")
        N
    }
}
