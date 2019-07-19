package practica.queue.tarjeta.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@Setter
@ToString
public class TarjetaCreatedEvent {
	

	public String id;
	private String numero;
	
	private String idusuario;

}
