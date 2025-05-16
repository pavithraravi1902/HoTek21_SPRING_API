package com.hotek21.guest_service.repository;

import com.hotek21.guest_service.model.GuestSession;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface GuestSessionRepository extends JpaRepository<GuestSession, Long> {
    Optional<GuestSession> findBySessionKey(String sessionKey);
}
