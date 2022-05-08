package tsis.proyecto.datos;

import org.springframework.data.repository.CrudRepository;

import tsis.proyecto.negocio.modelo.Token;

import java.util.Optional ;

/**
 * 
 * Repositorio para los Tokens.
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

public interface TokenRepository  extends CrudRepository <Token, Long> {
	public Optional<Token> findByUsuarioId ( long usuarioId ) ;
}
