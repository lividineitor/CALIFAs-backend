package tsis.proyecto.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsis.proyecto.datos.PreferenciaRepository ;

/**
 * 
 * Servicio que controla las actividades de las configuraciones del sistema.
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@Service
public class ServicioPreferencia {

	@Autowired
	PreferenciaRepository preferenciaRepository ;
	
}
