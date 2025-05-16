package com.hotek21.guest_service.service;

import com.hotek21.guest_service.model.GuestSession;

import java.util.List;

public interface GuestSessionService {
    GuestSession createSession(GuestSession session);
    GuestSession updateSession(Long id, GuestSession session);
    GuestSession getSessionById(Long id);
    List<GuestSession> getAllSessions();
    void deleteSession(Long id);
}
