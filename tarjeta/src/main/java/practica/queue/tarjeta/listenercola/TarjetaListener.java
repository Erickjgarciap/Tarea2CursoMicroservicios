package practica.queue.tarjeta.listenercola;

import java.util.HashMap;
import java.util.UUID;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import practica.queue.tarjeta.model.Tarjeta;
import practica.queue.tarjeta.service.TarjetaService;

@Slf4j
@RabbitListener(queues = "usercreated.account.queue2")
public class TarjetaListener {
		
	@Autowired 
	TarjetaService ts;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@RabbitHandler
	public void receive(String in) {
		log.info("---------------------------");
		log.info("Recibiendo tarjeta para activar " + in );

		doSomething(in);
		
	}
	
	@SneakyThrows
	private void doSomething(String entrada) {
		
		HashMap<String,Object> f = objectMapper.readValue(entrada,new TypeReference<HashMap<String, String>>() {} );
		
		Tarjeta tj =  new Tarjeta();
		tj.setIdusuario(Integer.parseInt((String) f.get("id")));
		tj.setNumero(UUID.randomUUID().toString());
		ts.save(tj);
		
	}
}
