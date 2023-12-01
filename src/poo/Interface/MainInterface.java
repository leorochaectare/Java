package poo.Interface;

import java.time.LocalDateTime;
import java.util.UUID;

import poo.Interface.models.Message;
import poo.Interface.repository.MessageRepository;
import poo.Interface.service.IMessageService;
import poo.Interface.service.MessageService;

public class MainInterface {
	
	public static Message newMessage(UUID id, String user, String messageDescription) {
		var message = new Message();
		message.setId(id);
		message.setUser(user);
		message.setMessage(messageDescription);
		message.setCreatedDate(LocalDateTime.now());
		
		return message;
	}
	
	public static void main(String[] args) {
		
		MessageService messageService = new MessageService(new MessageRepository());
		
		messageService.createMessage(newMessage(UUID.fromString("04e7800b-17d1-40d7-830f-733b7c500ae0"), "ADMIN", "Good Nigth Batman!"));
		messageService.createMessage(newMessage(UUID.fromString("842fb552-098b-497a-86a5-357c4eaa1b7c"), "USER_ROLER", "Xampson!"));
//		messageService.createMessage(newMessage("ADMIN", "Good Morning!"));
		
//		System.out.println(messageService.findAllMessage());
		
		System.out.println(messageService.findMessage(UUID.fromString("842fb552-098b-497a-86a5-357c4eaa1b7c")));
		
		
		
	}

}
