package tsis.proyecto.negocio.modelo;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity ;
import javax.persistence.GeneratedValue ;
import javax.persistence.GenerationType ;
import javax.persistence.Id ;

import lombok.Data ;

/**
 * 
 * Entidad de negocio Token
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@Entity
@Data
public class Token {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long tokenId ;
	
	private String token ;
	private long usuarioId ;
	private LocalDateTime creacion ;
	private LocalTime duracion ;
	
}
