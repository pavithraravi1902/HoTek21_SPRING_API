package com.hotek21.hotel_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hotel")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier for the hotel", example = "1", required = true)
    private Long id;

    @Column(name = "brand_id", nullable = false)
    @Schema(description = "ID of the hotel brand", example = "101", required = true)
    private Long brandId;

    @Column(nullable = false)
    @Schema(description = "Name of the hotel", example = "Marriott Grand", required = true)
    private String name;

    @Column(name = "city_id", nullable = false)
    @Schema(description = "ID of the city where the hotel is located", example = "10", required = true)
    private Long cityId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Schema(description = "Status of the hotel", example = "A", required = true)
    private Status status;

    @Column(nullable = false, columnDefinition = "TEXT")
    @Schema(description = "Location details of the hotel", example = "Near Marina Beach, Chennai", required = true)
    private String location;

    @Column(nullable = false, columnDefinition = "TEXT")
    @Schema(description = "Hotel description", example = "5-star luxury hotel with all modern amenities", required = true)
    private String description;

    @Column(name = "image_path", nullable = false)
    @Schema(description = "Path to hotel image", example = "/images/marriott.jpg", required = true)
    private String imagePath;

    public enum Status {
        @Schema(description = "Active hotel")
        A,

        @Schema(description = "Inactive hotel")
        I
    }
}
