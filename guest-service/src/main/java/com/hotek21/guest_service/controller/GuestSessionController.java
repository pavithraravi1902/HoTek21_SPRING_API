package com.hotek21.guest_service.controller;

import com.hotek21.guest_service.model.GuestSession;
import com.hotek21.guest_service.service.GuestSessionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest-sessions")
@Tag(name = "Guest Session API", description = "Endpoints for managing guest session")
@RequiredArgsConstructor
public class GuestSessionController {

    private final GuestSessionService sessionService;

    @PostMapping
    public ResponseEntity<GuestSession> create(@RequestBody GuestSession session) {
        return ResponseEntity.ok(sessionService.createSession(session));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GuestSession> update(@PathVariable Long id, @RequestBody GuestSession session) {
        return ResponseEntity.ok(sessionService.updateSession(id, session));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GuestSession> getById(@PathVariable Long id) {
        return ResponseEntity.ok(sessionService.getSessionById(id));
    }

    @GetMapping
    public ResponseEntity<List<GuestSession>> getAll() {
        return ResponseEntity.ok(sessionService.getAllSessions());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        sessionService.deleteSession(id);
        return ResponseEntity.noContent().build();
    }
}
