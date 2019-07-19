package practica.queue.users.sender;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import practica.queue.users.event.UserCreatedEvent;
@Slf4j
@Component
public class UserMessageSender {

	@Autowired
	private RabbitTemplate template;
	
	@Autowired
	FanoutExchange fanoutExchange;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@SneakyThrows
	@EventListener
	public void send(UserCreatedEvent uce) {
		log.info("Se procede a mandar mensaje para crear tarjeta", fanoutExchange.getName());
		//template.convertAndSend(queue.getName(), message);
		template.convertAndSend(fanoutExchange.getName(), "",objectMapper.writeValueAsString(uce));
		log.info("--------------------------------------------------------------");
		
	}
	
	
	
}
