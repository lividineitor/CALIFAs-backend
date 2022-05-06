package tsis.proyecto.negocio.modelo;

import javax.persistence.Entity ;
import javax.persistence.GeneratedValue ;
import javax.persistence.GenerationType ;
import javax.persistence.Id ;

import lombok.Data ;

import java.time.LocalTime ;

/**
 * 
 * Entidad de negocio preferencias del sistema.
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@Entity
@Data
public class Preferencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long preferenciaId ;
	
	private LocalTime tiempoDeExpiracion ;
	private LocalTime esperaEntreTurnos ;
	private LocalTime tiempoDeSesion ;
	private String urlDestino ;
	
}
