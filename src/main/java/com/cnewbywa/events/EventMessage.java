package com.cnewbywa.events;

import java.time.Instant;

public record EventMessage(String id, String affectedId, String action, String message, Instant creationTime, String applicationId) {}
