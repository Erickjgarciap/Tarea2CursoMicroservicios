package practica.queue.users.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserCreatedEvent {

	public String idMensaje;
	public long id;

	public String name;

	public String email;
	
	public String enviartarjeta;
}
