package practica.queue.tarjeta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//entidad
@Entity
//constructor sin argumentos
@NoArgsConstructor
//constructor con argumentos
@AllArgsConstructor
@Builder
public class Tarjeta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String numero;
	
	private int idusuario;
	
	
	
	
}
