package poo.Interface.models;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Message {
	private UUID id;
	private String user;
	private String message;
	private LocalDateTime createdDate;
	
	public Message() {
		
	}
	
	public Message (UUID id, String user, String message, LocalDateTime createdDate) {
		this.id = id;
		this.user = user;
		this.message = message;
		this.createdDate = createdDate;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", user=" + user + ", message=" + message + ", createdDate=" + createdDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdDate, id, message, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		return Objects.equals(createdDate, other.createdDate) && Objects.equals(id, other.id)
				&& Objects.equals(message, other.message) && Objects.equals(user, other.user);
	}
	
	
	
	

}
