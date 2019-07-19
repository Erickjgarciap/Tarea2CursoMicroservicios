package practica.queue.tarjeta.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import practica.queue.tarjeta.event.TarjetaCreatedEventBuilder;
import practica.queue.tarjeta.model.Tarjeta;
import practica.queue.tarjeta.repository.TarjetaRepository;
import practica.queue.tarjeta.service.TarjetaService;

@Service
public class TarjetaServiceImp implements TarjetaService{

	@Autowired
	TarjetaRepository tj;
	@Autowired
	ApplicationEventPublisher publisher;
	
	@Override
	public void save(Tarjeta tarjeta) {
		tj.save(tarjeta);
		publisher.publishEvent(TarjetaCreatedEventBuilder.build(tarjeta));
		
	}



}
