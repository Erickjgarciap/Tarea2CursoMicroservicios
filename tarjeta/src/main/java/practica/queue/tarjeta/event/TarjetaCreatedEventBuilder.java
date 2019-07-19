package practica.queue.tarjeta.event;

import java.util.UUID;

import practica.queue.tarjeta.model.Tarjeta;



public class TarjetaCreatedEventBuilder {
	
	public static TarjetaCreatedEvent build(Tarjeta user) {
		return TarjetaCreatedEvent.builder().idusuario( user.getIdusuario()+"")
.numero(user.getNumero())
.id(UUID.randomUUID().toString())
				.build();
	}

}
