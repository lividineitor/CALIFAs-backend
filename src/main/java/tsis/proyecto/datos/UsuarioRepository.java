package tsis.proyecto.datos;

import org.springframework.data.repository.CrudRepository;

import tsis.proyecto.negocio.modelo.Usuario;

import java.util.List ;
import java.util.Optional;

/**
 * 
 * Repositorio para los usuarios.
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

public interface UsuarioRepository  extends CrudRepository <Usuario, Long> {
	public Optional<Usuario> findByEmail ( String email ) ;
}
