package poo.Interface.repository;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import Utils.ControllerNotFoundException;
import poo.Interface.models.Message;

public class MessageRepository {
	
	private List<Message> listMessages = new LinkedList<>();
	
	public Message findById(UUID id) {
		var message = listMessages.stream()
				.filter(item -> item.getId().equals(id))
				.findFirst()
				.orElseThrow(() -> new ControllerNotFoundException("ID not found"));
		return message;
	}
	
	public List<Message> findAll() {
		return listMessages;
	}
	
	public Message save(Message message) {
		listMessages.add(message);
		
		return message;
	}
	
	public boolean exitsById(UUID id) {
		Message message = listMessages.stream().filter(item -> item.getId().equals(id)).findFirst().get();
		return message != null ? true : false;
	}
	
	public boolean deleteById(UUID id) {
		var message = findById(id);
		
		listMessages.remove(message);
		return exitsById(id);
	}
	

}
