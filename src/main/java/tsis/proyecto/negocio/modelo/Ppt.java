package tsis.proyecto.negocio.modelo;

import javax.persistence.Entity ;
import javax.persistence.GeneratedValue ;
import javax.persistence.GenerationType ;
import javax.persistence.Id ;

import lombok.Data ;

/**
 * 
 * Entidad de negocio Ppt
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@Entity
@Data
public class Ppt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pptId ;
	
	private String nombre ;
	private int cantidadDeUsuariosMinima ;
	private int cantidadDeUsuariosMaxima ;
	private String logotipo ;
	private long usuarioId1 ;
	private String eleccion1 ;
	private long usuarioId2 ;
	private String eleccion2 ;
	private long ganador ;
	
}
