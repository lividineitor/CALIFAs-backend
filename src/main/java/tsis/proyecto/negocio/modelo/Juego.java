package tsis.proyecto.negocio.modelo;

import java.time.LocalTime;

import javax.persistence.Entity ;
import javax.persistence.GeneratedValue ;
import javax.persistence.GenerationType ;
import javax.persistence.Id ;

import lombok.Data ;

/**
 * 
 * Entidad de negocio Juego
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@Entity
@Data
public class Juego {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long juegoId ;
	
	private String nombre ;
	private long juegoIdDeReferencia ;
	private int cantidadDeUsuariosMinima ;
	private int cantidadDeUsuariosMaxima ;
	private String logotipo ;
	private LocalTime esperaEntreTurnos ;
	
}
