package com.hotek21.city_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "city")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier for the city", example = "1", required = true)
    private Long id;

    @Column(nullable = false, unique = true)
    @Schema(description = "Unique code for the city", example = "CHN001", required = true)
    private String code;

    @Column(nullable = false)
    @Schema(description = "Name of the city", example = "Chennai", required = true)
    private String name;

    @Column(name = "destination_id", nullable = false)
    @Schema(description = "ID of the destination from destination-service", example = "101", required = true)
    private Long destinationId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Schema(description = "Status of the city", example = "A", required = true)
    private Status status;

    public enum Status {
        @Schema(description = "Active status of the city")
        A,

        @Schema(description = "Inactive status of the city")
        I
    }
}
