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
					
			Ppt pptRespaldo = pptRespuesta.get() ;
			
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
			
			if ( !pptRespaldo.equals(ppt) )
				return ppt ;
			
			else
				return null ;
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
	 * Regresa la cantidad de usuarios máxima
	 * 
	 * @return int Cantidad de usuarios
	 * 
	 */
	public int getCantidadDeUsuariosMaxima () {
		return this.cantidadDeUsuariosMaxima ;
	}
	
	/**
	 * Regresa la cantidad de usuarios mínima
	 * 
	 * @return int Cantidad de usuarios
	 * 
	 */
	public int getCantidadDeUsuariosMinima () {
		return this.cantidadDeUsuariosMinima ;
	}
	
	/**
	 * 
	 * Regresa la ruta del logotipo del juego.
	 * 
	 * @return String Ruta del logotipo del juego.
	 * 
	 */
	public String getLogotipo () {
		return this.logotipo ;
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
	
	/**
	 * 
	 * Si las dos elecciones están vacías, asigna la correspondiente y 
	 * regresa un "204", si una está vacía, hace la asigna, evalúa el ganador y
	 * genera un push a la aplicación para que actualize el frontend.
	 * 
	 * @param Ppt La instancia que se está jugando
	 * @param usuarioId El Id del usuario que está haciendo la petición
	 * @param eleccion La elección que hizo el usuario
	 * 
	 * @return String "204" o "push" o "error" si algo falla.
	 * 
	 */
	public Ppt eleccionPpt ( Ppt ppt , long usuarioId , String eleccion ) {
		
		Ppt respuesta = null ;
		
		boolean usuario1 = false ;
		boolean usuario2 = false ;
		
		if ( ppt.getEleccion1() == null && ppt.getEleccion2() == null ) {
			
			if ( ppt.getUsuarioId1() == usuarioId ) {
				ppt.setEleccion1(eleccion);
				usuario1 = true ;
			}
			
			else {
				ppt.setEleccion2(eleccion);
				usuario2 = true ;
			}
			
			respuesta = pptRepository.save(ppt) ;
			
			if ( usuario1 )
				if ( respuesta.getEleccion1() == null )
					return null ;
			
			if ( usuario2 )
				if ( respuesta.getEleccion2() == null )
					return null ;
			
			return respuesta ;
			
		}
		
		else {
			
			if ( ppt.getEleccion1() != null && ppt.getEleccion2() != null )
				return null ;
			
			else {
				if ( ppt.getUsuarioId1() == usuarioId )
					ppt.setEleccion1(eleccion);
				
				else 
					ppt.setEleccion2(eleccion);
				
				respuesta = pptRepository.save(ppt) ;
				
				if ( respuesta.getEleccion1() != null && respuesta.getEleccion2() != null ) {
					String eleccion1 = respuesta.getEleccion1() ;
					String eleccion2 = respuesta.getEleccion2() ;
					
					if ( eleccion1.equals(eleccion2) )
						respuesta.setGanador( -1 );
					
					else if ( ( eleccion1.equals( "piedra" ) && eleccion2.equals("tijeras") ) || 
							( eleccion1.equals( "papel" ) && eleccion2.equals( "piedra" ) ) || 
							( eleccion1.equals ( "tijeras" ) && eleccion2.equals( "papel" ) ) )
						respuesta.setGanador ( respuesta.getUsuarioId1() ) ;
					
					else
						respuesta.setGanador ( respuesta.getUsuarioId2() ) ;
					
					respuesta = pptRepository.save(respuesta) ;
					
					if ( respuesta.getGanador() != 0 )
						return respuesta ;
					
					else
						return null ;
				}
				
				else
					return null ;
				

			}
		}
		
	}
	
}
