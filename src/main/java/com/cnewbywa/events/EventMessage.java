package com.cnewbywa.events;

import java.time.Instant;

public class EventMessage {
	
	private String id;
	private String affectedId;
    private String action;
    private String message;
    private Instant creationTime;
    private String applicationId;
	
	public EventMessage() {
		
	}
	
	public EventMessage(String id, String affectedId, String action, String message, Instant creationTime, String applicationId) {
		this.id = id;
		this.affectedId = affectedId;
		this.action = action;
		this.message = message;
		this.creationTime = creationTime;
		this.applicationId = applicationId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAffectedId() {
		return affectedId;
	}

	public void setAffectedId(String affectedId) {
		this.affectedId = affectedId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Instant getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Instant creationTime) {
		this.creationTime = creationTime;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
}
