package tsis.proyecto.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsis.proyecto.api.dto.JuegoDto;
import tsis.proyecto.datos.JuegoRepository;
import tsis.proyecto.negocio.modelo.Juego;
import tsis.proyecto.negocio.modelo.Ppt;

/**
 * 
 * Servicio que controla los movimientos de los juegos".
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@Service
public class ServicioJuego {

	@Autowired
	JuegoRepository juegoRepository ;
	
	// Servicios de los juegos del sistema	
	@Autowired
	ServicioPpt servicioPpt ;

	// Métodos públicos
	
	/**
	 *
	 * Método que crea una nueva instancia del juego solicitado.
	 * @param juego El juego solicitado
	 * @return Juego El juego creado
	 * 
	 */
	/*public Juego createJuego ( Juego juego ) {
		
		Juego juegoARetornar = new Juego () ;

		//juegoARetornar = getJuego ( juego.getNombre() ) ;
		
	}*/
	
	/**
	 * 
	 * Método que convierte un JuegoDto a Juego.
	 * 
	 * @param juegoDto El dto a convertir.
	 * @return Juego El juego convertido
	 * 
	 */
	public Juego dtoToJuego ( JuegoDto juegoDto ) {
		
		Juego juego = new Juego () ;
		
		juego.setJuegoId( juegoDto.getJuegoId() );
		juego.setNombre( juegoDto.getNombre() );
		juego.setJuegoIdDeReferencia( juegoDto.getJuegoIdDeReferencia() );
		juego.setCantidadDeUsuariosMaxima( juegoDto.getCantidadDeUsuariosMaxima() );
		juego.setCantidadDeUsuariosMinima( juegoDto.getCantidadDeUsuariosMinima() );
		juego.setLogotipo( juegoDto.getLogotipo() );
		juego.setEsperaEntreTurnos( juegoDto.getEsperaEntreTurnos() );
		
		return juego ;
	}

	// Métodos privados
	
	/**
	 * 
	 * Método que manda a buscar el juego si existe, de lo contrario genera una excepción
	 * 
	 * @param nombreDelJuego Nombre del juego a buscar.
	 * @return Juego El juego buscado.
	 * @throws 
	 * 
	 */
	private Juego getJuego ( String nombreDelJuego ) {
		
		Juego juego = new Juego () ;
		
		Ppt ppt = new Ppt () ;
		
		if ( servicioPpt.getNombreDelJuego().equals( nombreDelJuego ) ) 
		{}		
	
		return juego ;
		
	}
	
}
