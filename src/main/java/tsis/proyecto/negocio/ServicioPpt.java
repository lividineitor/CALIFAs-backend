package tsis.proyecto.negocio;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsis.proyecto.api.dto.PptDto;
import tsis.proyecto.datos.PptRepository ;
import tsis.proyecto.negocio.modelo.Ppt;

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

	// Campos necesarios
	
	String nombreDelJuego = "Piedra, papel o tijeras" ;
	int cantidadDeUsuariosMaxima = 2 ;
	int cantidadDeUsuariosMinima = 2 ;
	String logotipo = "../images/ppt.png" ;
	
	
	// Métodos públicos
	
	// Metodos para la API
	
	/**
	 * 
	 * Crea una nueva instancia del juego.
	 * 
	 * @param usuarioId1 Id del primer usuario.
	 * @param usuarioId2 Id de segundo usuario.
	 * 
	 * @return Ppt La instancia del juego creado o null.
	 * 
	 */
	public Ppt createPpt ( long usuarioId1 , long usuarioId2 ) {
	
		Ppt ppt = new Ppt () ;
		
		ppt.setPptId( 0 );
		ppt.setNombre( this.nombreDelJuego ) ;
		ppt.setCantidadDeUsuariosMaxima( this.cantidadDeUsuariosMaxima );
		ppt.setCantidadDeUsuariosMinima( this.cantidadDeUsuariosMinima );
		ppt.setLogotipo( this.logotipo );
		ppt.setUsuarioId1( usuarioId1 );
		ppt.setEleccion1( null );
		ppt.setUsuarioId2( usuarioId2 );
		ppt.setEleccion2( null );
		ppt.setGanador( 0 );
		
		ppt = pptRepository.save( ppt ) ;
		
		if ( ppt.getPptId() == 0 )
			return null ;
		
		else
			return ppt ;
	}
	
	/**
	 * 
	 * Regresa una instancia del juego por su id.
	 * 
	 * @param juegoId Id del juego.
	 * 
	 * @return Ppt La instancia del juego o null.
	 * 
	 */
	public Ppt getPpt ( long pptId ) {
		
		Optional<Ppt> ppt ;
		
		ppt = pptRepository.findById( pptId ) ;
		
		if ( ppt.isEmpty() )
			return null ;
		
		else
			return ppt.get() ;
		
	}
	
	/**
	 * 
	 * Actualiza los valores de una instancia del juego.
	 * 
	 * @param Ppt Ppt con las modificaciones.
	 * 
	 * @return Ppt El Ppt ya modificado o null.
	 * 
	 */
	public Ppt updatePpt ( Ppt update ) {
		
		Optional<Ppt> pptRespuesta = pptRepository.findById( update.getPptId() );
		
		if ( pptRespuesta.isEmpty() )
			return null ;			
		
		else {
			
			Ppt ppt = pptRespuesta.get() ;
						
			if ( update.getNombre() != null )
				ppt.setNombre( update.getNombre() );
			
			if ( update.getCantidadDeUsuariosMaxima() != 0 )
				ppt.setCantidadDeUsuariosMaxima( update.getCantidadDeUsuariosMaxima());

			if ( update.getCantidadDeUsuariosMinima() != 0 )
				ppt.setCantidadDeUsuariosMinima( update.getCantidadDeUsuariosMinima());

			if ( update.getLogotipo() != null )
				ppt.setLogotipo( update.getLogotipo());
			
			if ( update.getUsuarioId1() != 0 )
				ppt.setUsuarioId1( update.getUsuarioId1());
			
			if ( update.getEleccion1() != null )
				ppt.setEleccion1( update.getEleccion1() );
			
			if ( update.getUsuarioId2() != 0 )
				ppt.setUsuarioId2( update.getUsuarioId2() );
			
			if ( update.getEleccion2() != null )
				ppt.setEleccion2( update.getEleccion2() );
				
			ppt = pptRepository.save( ppt ) ;
				
			return ppt ;
		}

	}
	
	/**
	 * 
	 * Elimina un juego por su id.
	 * 
	 * @param juegoId El id del juego a eliminar.
	 * 
	 * @return boolean True si el juego se eliminó false en otro caso.
	 * 
	 */
	public boolean deletePpt ( long pptId ) {
		
		Optional<Ppt> ppt ;
		
		pptRepository.deleteById( pptId );
		
		ppt = pptRepository.findById( pptId ) ;
		
		if ( ppt.isEmpty() )
			return true ;
		
		else
			return false ;
		
	}
	
	/**
	 * 
	 * Regresa todas las intancias de ppt.
	 * 
	 * @return List<Ppt> Una lista con las instancias de ppt.
	 * 
	 */
	public Iterable<Ppt> getPpts () {
		
		return pptRepository.findAll() ;
		
	}
	
	/**
	 * 
	 * Elimina todas las instancias de ppt.
	 * 
	 * @return boolean True si se eliminaron todas, false de lo contrario.
	 * 
	 */
	public boolean deletePpts () {
		
		Iterable<Ppt> ppts ;
		
		pptRepository.deleteAll();
		
		ppts = pptRepository.findAll() ;
		
		if ( ppts.iterator().hasNext() )
			return false ;
		
		else
			return true ;
		
	}
	
	/**
	 * 
	 * Regresa el nombre del juego para comparaciones externas.
	 * 
	 * @return String	El nombre del juego.
	 */
	public String getNombreDelJuego () {
		
		return this.nombreDelJuego ;
	
	}
	
}
