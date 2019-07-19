package practica.queue.users.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import practica.queue.users.event.UserCreatedEventBuilder;
import practica.queue.users.model.User;
import practica.queue.users.repository.UserRepository;
import practica.queue.users.sender.UserMessageSender;
import practica.queue.users.service.UserService;
@Slf4j
@Service

public class UserServiceImp implements UserService{

	@Autowired 
	UserRepository ff;
	@Autowired
	UserMessageSender ms;
	
	@Autowired
	ApplicationEventPublisher publisher;
	@Override
	@SneakyThrows
	public User retrieveById(Long id) {
		// TODO Auto-generated method stub
		
		
	return	ff.findById(id).orElseThrow(()-> new Exception("algo ocurrio"));
	}
	@Override
	public List<User> retrieveAll() {
		// TODO Auto-generated method stub
	return 	ff.findAll();
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
		log.info("Guardando usuario");
		
		ff.save(user);
		//ms.send(UserCreatedEventBuilder.build(user));
		if(user.getEnviartarjeta().equals("true")) {
			
			publisher.publishEvent(UserCreatedEventBuilder.build(user));
		
		}
		
	}

}
