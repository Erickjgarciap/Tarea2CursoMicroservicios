package practica.queue.tarjeta.sender;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import practica.queue.tarjeta.event.TarjetaCreatedEvent;

@Slf4j
@Component
public class TarjetaSender {
	@Autowired
	private RabbitTemplate template;
	
	@Autowired
	FanoutExchange fanoutExchange;
	
	@Autowired
	ObjectMapper objectMapper;
	@SneakyThrows
	@EventListener
	public void send(TarjetaCreatedEvent uce) {
		//log.info("Escuchando la tarjeta que va a ser creada", fanoutExchange.getName());
		log.info("Escuchando la tarjeta que va a ser enviada {}", uce.toString() );
		log.info("La tarjeta --->{} ", uce.getNumero() + " Sera enviada a la direccion que dio de alta el cliente " );
		//template.convertAndSend(queue.getName(), message);
		//template.convertAndSend(fanoutExchange.getName(), "",objectMapper.writeValueAsString(uce));
		log.info("--------------------------------------------------------------");
		
		
	}
	
	
}
