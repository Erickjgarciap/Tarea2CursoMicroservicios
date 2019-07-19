package practica.queue.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import practica.queue.users.model.User;
import practica.queue.users.service.UserService;

@RestController
@CrossOrigin
public class Usercontroller {

	@Autowired
	UserService d;
	
	
	
	@PostMapping
	public void  guardarUsuario(@RequestBody User user) {
		
		 d.save(user);
		
		
	}
	
	@GetMapping("/{userId}")
	public User getUnusuario(@PathVariable long userId) {
		return d.retrieveById(userId);
		
	}
	
	@GetMapping()
	public List<User> obtenerTodos(){
		
		return d.retrieveAll();
	}
	
}
