package practica.queue.users.service;

import java.util.List;

import practica.queue.users.model.User;

public interface UserService {
	void save(User user);
	
	User retrieveById(Long id);
	
	List<User> retrieveAll();
	

}
