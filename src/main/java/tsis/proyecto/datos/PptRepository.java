package tsis.proyecto.datos;

import org.springframework.data.repository.CrudRepository;

import tsis.proyecto.negocio.modelo.Ppt;

import java.util.List ;

/**
 * 
 * Repositorio para el juego "Piedra, papel o tijeras".
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

public interface PptRepository  extends CrudRepository <Ppt, Long> {

}
