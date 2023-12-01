package poo.Interface.service;

import java.util.List;
import java.util.UUID;

import poo.Interface.models.Message;

public interface IMessageService {
	
	public Message findMessage(UUID id);
	
	public Message createMessage(Message message);
	
	public boolean deleteMessage(UUID id);
	
	public List<Message> findAllMessage();
	

}
