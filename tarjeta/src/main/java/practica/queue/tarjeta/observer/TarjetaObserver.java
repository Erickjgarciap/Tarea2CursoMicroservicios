package practica.queue.tarjeta.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import practica.queue.tarjeta.event.TarjetaCreatedEvent;

@Slf4j
@Component
public class TarjetaObserver {
	
	
	@Autowired
	ObjectMapper objectMapper;
	@SneakyThrows
	@EventListener
	public void sendDomicilio(TarjetaCreatedEvent uce) {
		//log.info("Escuchando la tarjeta que va a ser creada", fanoutExchange.getName());
		
		log.info("Se ha creado la tarjeta y sera enviada {}", uce.toString() );
		//template.convertAndSend(queue.getName(), message);
		//template.convertAndSend(fanoutExchange.getName(), "",objectMapper.writeValueAsString(uce));
		log.info("--------------------------------------------------------------");
		
		
	}

}
