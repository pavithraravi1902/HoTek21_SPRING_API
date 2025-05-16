package com.hotek21.guest_service.service.impl;

import com.hotek21.guest_service.model.GuestSession;
import com.hotek21.guest_service.repository.GuestSessionRepository;
import com.hotek21.guest_service.service.GuestSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuestSessionServiceImpl implements GuestSessionService {

    private final GuestSessionRepository repository;

    @Override
    public GuestSession createSession(GuestSession session) {
        return repository.save(session);
    }

    @Override
    public GuestSession updateSession(Long id, GuestSession session) {
        GuestSession existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Session not found"));
        existing.setLoginDateTime(session.getLoginDateTime());
        existing.setLogoutDateTime(session.getLogoutDateTime());
        existing.setSessionKey(session.getSessionKey());
        existing.setGuestId(session.getGuestId());
        return repository.save(existing);
    }

    @Override
    public GuestSession getSessionById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Session not found"));
    }

    @Override
    public List<GuestSession> getAllSessions() {
        return repository.findAll();
    }

    @Override
    public void deleteSession(Long id) {
        repository.deleteById(id);
    }
}
