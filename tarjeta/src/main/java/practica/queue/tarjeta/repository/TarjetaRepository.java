package practica.queue.tarjeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import practica.queue.tarjeta.model.Tarjeta;

public interface TarjetaRepository  extends JpaRepository<Tarjeta,Long>{
	
	

}
