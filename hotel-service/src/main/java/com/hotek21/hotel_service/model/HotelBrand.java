package com.hotek21.hotel_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hotel_brand")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier for the hotel brand", example = "1", required = true)
    private Long id;

    @Column(nullable = false, unique = true)
    @Schema(description = "Unique code for the hotel brand", example = "MARR001", required = true)
    private String code;

    @Column(nullable = false)
    @Schema(description = "Name of the hotel brand", example = "Marriott", required = true)
    private String name;

    @Column(name = "city_id", nullable = false)
    @Schema(description = "Reference to the city ID", example = "1", required = true)
    private Long cityId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Schema(description = "Status of the hotel brand", example = "A", required = true)
    private Status status;

    public enum Status {
        @Schema(description = "Active hotel brand")
        A,

        @Schema(description = "Inactive hotel brand")
        I
    }
}
