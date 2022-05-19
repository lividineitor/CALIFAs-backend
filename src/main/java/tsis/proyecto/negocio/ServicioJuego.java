package tsis.proyecto.negocio;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsis.proyecto.api.dto.JuegoDto;
import tsis.proyecto.api.dto.JuegosDto;
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

	LocalTime esperaEntreTurnos ;
	
	// Métodos públicos
	
	/**
	 *
	 * Método que crea una nueva instancia del juego solicitado.
	 * @param juego El juego solicitado
	 * @return Juego El juego creado
	 * 
	 */
	/*public Juego createJuego ( Juego juego ) {
		
		Juego juegoNuevo = new Juego () ;

		juegoARetornar = getJuego ( juego ) ;
		
	}*/
	
	/**
	 * 
	 * Regresa la lista de juegos creados en el sistema
	 * 
	 * @return
	 */
	//public JuegosDto getJuegos () {}

	/**
	 * 
	 * Regresa el catálogo de juegos
	 * 
	 * @return JuegosDto Contiene el catálogo de juegos.
	 * 
	 */
	
	public JuegosDto getCatalogo () {
		
		JuegoDto dto = new JuegoDto () ;
		
		JuegosDto juegos = new JuegosDto () ;
		
		Juego juegoPpt = new Juego () ;
		
		// El juego "Piedra, papel o tijeras"
		
		juegoPpt.setCantidadDeUsuariosMaxima( servicioPpt.getCantidadDeUsuariosMaxima());
		juegoPpt.setCantidadDeUsuariosMinima(servicioPpt.getCantidadDeUsuariosMinima());
		juegoPpt.setNombre(servicioPpt.getNombreDelJuego());
		juegoPpt.setLogotipo(servicioPpt.getLogotipo());
		juegoPpt.setEsperaEntreTurnos(this.esperaEntreTurnos);
		
		dto = dto.toDto( juegoPpt ) ;
		
		juegos.addJuegosItem( dto ) ;
		
		return juegos ;
		
	}
	
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
	/*private Juego getJuego ( Juego juego ) {
		
		Juego juegoNuevo = new Juego () ;
		
		Ppt ppt = new Ppt () ;
		
		if ( servicioPpt.getNombreDelJuego().equals( juego.getNombre() ) ) 
		{
			
			ppt = servicioPpt.createPpt(juego.get, 0)
		}		
	
		return juego ;
		
	}*/
	
	
	
	
}
