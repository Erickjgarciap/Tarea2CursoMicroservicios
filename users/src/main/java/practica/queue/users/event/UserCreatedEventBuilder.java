package practica.queue.users.event;

import java.util.UUID;

import practica.queue.users.model.User;

public class UserCreatedEventBuilder {

	public static UserCreatedEvent build(User user) {
		return UserCreatedEvent.builder()
				.id(user.getId())
				.idMensaje(UUID.randomUUID().toString())
				.name(user.getName())
				.email(user.getEmail())
				.enviartarjeta(user.getEnviartarjeta())
				.build();
	}
}
