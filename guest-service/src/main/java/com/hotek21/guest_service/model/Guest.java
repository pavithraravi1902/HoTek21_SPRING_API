package com.hotek21.guest_service.model;

import jakarta.persistence.*;
import lombok.*;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

@Entity
@Table(name = "guest")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique ID of the guest", example = "1")
    private Long id;

    @Column(name = "first_name", nullable = false)
    @Schema(description = "First name of the guest", example = "John")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @Schema(description = "Last name of the guest", example = "Doe")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Schema(description = "Gender of the guest", example = "M")
    private Sex sex;

    @Column(nullable = false)
    @Schema(description = "Date of birth of the guest", example = "1990-05-15")
    private LocalDate dob;

    @Column(name = "email_id", nullable = false, unique = true)
    @Schema(description = "Email ID of the guest", example = "john.doe@example.com")
    private String emailId;

    @Column(nullable = false)
    @Schema(description = "Password of the guest", example = "securePassword123")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Schema(description = "Status of the guest", example = "A")
    private Status status;

    public enum Sex {
        @Schema(description = "Male")
        M,

        @Schema(description = "Female")
        F,

        @Schema(description = "Other")
        O
    }

    public enum Status {
        @Schema(description = "Active")
        A,

        @Schema(description = "Inactive")
        I
    }
}
