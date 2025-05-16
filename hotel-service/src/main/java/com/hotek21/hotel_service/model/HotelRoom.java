package com.hotek21.hotel_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hotel_room")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier for the hotel room", example = "1", required = true)
    private Long id;

    @Column(name = "room_no", nullable = false, unique = true)
    @Schema(description = "Room number", example = "101", required = true)
    private Integer roomNo;

    @Column(nullable = false)
    @Schema(description = "Name of the room", example = "Executive Room", required = true)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Schema(description = "Status of the room", example = "A", required = true)
    private Status status;

    @Column(name = "category_id", nullable = false)
    @Schema(description = "ID of the associated category", example = "1", required = true)
    private Long categoryId;

    @Column(name = "hotel_id", nullable = false)
    @Schema(description = "ID of the associated hotel", example = "1", required = true)
    private Long hotelId;

    public enum Status {
        @Schema(description = "Active room")
        A,
        @Schema(description = "Inactive room")
        I
    }
}
