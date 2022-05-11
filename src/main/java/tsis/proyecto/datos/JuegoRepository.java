package tsis.proyecto.datos;

import org.springframework.data.repository.CrudRepository;

import tsis.proyecto.negocio.modelo.Juego;

/**
 * 
 * Repositorio genérico para los juegos.
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

public interface JuegoRepository  extends CrudRepository <Juego, Long> {

}
