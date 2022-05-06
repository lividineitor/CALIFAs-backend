package tsis.proyecto.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsis.proyecto.datos.PptRepository ;

/**
 * 
 * Servicio que controla las actividades del juego "Piedra, papel o tijeras".
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@Service
public class ServicioPpt {

	@Autowired
	PptRepository pptRepository ;
	
}
