package poo.Interface.service;

import java.util.List;
import java.util.UUID;

import poo.Interface.models.Message;
import poo.Interface.repository.MessageRepository;

public class MessageService implements IMessageService {
	
	
	private MessageRepository messageRepository = new MessageRepository();
	
	public MessageService(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}

	@Override
	public Message findMessage(UUID id) {
		var message = messageRepository.findById(id);
		return message;
	}

	@Override
	public Message createMessage(Message message) {
		var messageCreated = messageRepository.save(message);
		return messageCreated;
	}

	@Override
	public boolean deleteMessage(UUID id) {
		var deleteMessage = messageRepository.deleteById(id);
		return deleteMessage;
	}

	@Override
	public List<Message> findAllMessage() {
		var listMessage = messageRepository.findAll();
		return listMessage;
	}
	
	

}
