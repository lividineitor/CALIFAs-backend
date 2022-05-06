package tsis.proyecto.datos;

import org.springframework.data.repository.CrudRepository;

import tsis.proyecto.negocio.modelo.Preferencia ;

import java.util.List ;

/**
 * 
 * Repositorio para las preferencias del sistema.
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

public interface PreferenciaRepository  extends CrudRepository <Preferencia, Long> {

}
