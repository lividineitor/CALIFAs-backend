package tsis.proyecto.datos;

import org.springframework.data.repository.CrudRepository;

import tsis.proyecto.negocio.modelo.Usuario;

import java.util.List ;

/**
 * 
 * Repositorio para los usuarios.
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

public interface UsuarioRepository  extends CrudRepository <Usuario, Long> {
	public Usuario findByNombre ( String nombre ) ;
	public Usuario findByEmail ( String email ) ;
}
