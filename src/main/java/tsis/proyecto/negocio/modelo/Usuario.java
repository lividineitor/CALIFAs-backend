package tsis.proyecto.negocio.modelo;

import javax.persistence.Entity ;
import javax.persistence.GeneratedValue ;
import javax.persistence.GenerationType ;
import javax.persistence.Id ;

import lombok.Data ;

/**
 * Entidad de negocio de usuario.
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@Entity
@Data
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long usuarioId ;
	
	private String email ;
	private String password ;
	private String rol ;
	private String nombre ;
	
}
