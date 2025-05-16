package com.hotek21.hotel_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(
        name = "category",
        uniqueConstraints = @UniqueConstraint(columnNames = {"name", "rate", "hotel_id", "tax"})
)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier for the category", example = "1", required = true)
    private Long id;

    @Column(nullable = false)
    @Schema(description = "Name of the room category", example = "Deluxe", required = true)
    private String name;

    @Column(nullable = false, precision = 10, scale = 2)
    @Schema(description = "Base rate of the category", example = "4500.00", required = true)
    private BigDecimal rate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Schema(description = "Status of the category", example = "A", required = true)
    private Status status;

    @Column(name = "hotel_id", nullable = false)
    @Schema(description = "ID of the associated hotel", example = "1", required = true)
    private Long hotelId;

    @Column(nullable = false, precision = 10, scale = 2)
    @Schema(description = "Applicable tax for the category", example = "12.00", required = true)
    private BigDecimal tax;

    public enum Status {
        @Schema(description = "Active category")
        A,

        @Schema(description = "Inactive category")
        I
    }
}
