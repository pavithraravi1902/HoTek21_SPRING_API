package com.hotek21.guest_service.model;

import jakarta.persistence.*;
import lombok.*;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Entity
@Table(name = "guest_session")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GuestSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique ID of the session", example = "1")
    private Long id;

    @Column(name = "guest_id", nullable = false)
    @Schema(description = "ID of the guest", example = "1001")
    private Long guestId;

    @Column(name = "login_date_time", nullable = false)
    @Schema(description = "Login time", example = "2025-05-16T09:00:00")
    private LocalDateTime loginDateTime;

    @Column(name = "logout_date_time")
    @Schema(description = "Logout time", example = "2025-05-16T11:00:00")
    private LocalDateTime logoutDateTime;

    @Column(name = "session_key", nullable = false, unique = true)
    @Schema(description = "Unique session key", example = "abc123xyz456")
    private String sessionKey;
}
