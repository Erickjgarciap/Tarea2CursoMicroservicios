package practica.queue.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import practica.queue.users.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
