package tsis.proyecto.negocio;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.String;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import tsis.proyecto.datos.PptRepository;
import tsis.proyecto.negocio.modelo.Ppt;

/**
 * 
 * Pruebas unitarias para la clase ServicioPpt
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@ExtendWith(MockitoExtension.class)
public class ServicioPptTest {

	@Mock
	private PptRepository pptRepository ;
	
	@InjectMocks
	private ServicioPpt servicio ;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	// Las pruebas del servicio
	
	@Test
	public void testCreatePpt() {
		
		// Variables a utilizar
		
		long usuario1 ;
		long usuario2 ;
		
		Ppt resultado ;
		Ppt pptResultado ;
		Ppt pptResultadoFallido ;
		
		// Condiciones iniciales
			
		usuario1 = 1 ;
		
		usuario2 = 2 ;
				
		// Valores a comparar
		
		pptResultadoFallido = new Ppt () ;
		
		pptResultadoFallido.setPptId( 0 );
		pptResultadoFallido.setNombre( "Piedra, papel o tijeras" );
		pptResultadoFallido.setCantidadDeUsuariosMaxima( 2 );
		pptResultadoFallido.setCantidadDeUsuariosMinima( 2 );
		pptResultadoFallido.setLogotipo( "logotipo" );
		pptResultadoFallido.setUsuarioId1( usuario1 );
		pptResultadoFallido.setEleccion1(null);
		pptResultadoFallido.setUsuarioId2(usuario2);
		pptResultadoFallido.setEleccion2(null);
		pptResultadoFallido.setGanador( 0 );
		
		pptResultado = new Ppt () ;
		
		pptResultado.setPptId( 1 );
		pptResultado.setNombre( "Piedra, papel o tijeras" );
		pptResultado.setCantidadDeUsuariosMaxima( 2 );
		pptResultado.setCantidadDeUsuariosMinima( 2 );
		pptResultado.setLogotipo( "logotipo" );
		pptResultado.setUsuarioId1( usuario1 );
		pptResultado.setEleccion1(null);
		pptResultado.setUsuarioId2(usuario2);
		pptResultado.setEleccion2(null);
		pptResultado.setGanador( 0 );
		
		// Prueba 1: Se crea un ppt exitosamente
	
		when ( pptRepository.save ( any(Ppt.class ) ) ).thenReturn(pptResultado) ;

		resultado = servicio.createPpt(usuario1, usuario2) ;
		
		assertEquals( true , pptResultado.equals(resultado) , "No se creo el ppt." );
		
		// Prueba 2: No se puede crear el ppt
		when ( pptRepository.save ( any(Ppt.class ) ) ).thenReturn(pptResultadoFallido) ;

		resultado = servicio.createPpt(usuario1, usuario2) ;
		
		assertEquals( false , pptResultado.equals(resultado) , "Se pudo crear el resultado." );
		
	}


	@Test
	public void testGetPpt() {

		// Variables a utilizar
		
		long pptId ;
		
		Ppt pptResultado = new Ppt () ;
		
		Ppt resultado ;
		
		Optional<Ppt> optionalVacio = Optional.empty() ;
		
		// Valores iniciales
		
		pptId = 1 ;
		
		// Valores a comparar
		
		pptResultado = new Ppt () ;
		
		pptResultado.setPptId( 1 );
		pptResultado.setNombre( "Piedra, papel o tijeras" );
		pptResultado.setCantidadDeUsuariosMaxima( 2 );
		pptResultado.setCantidadDeUsuariosMinima( 2 );
		pptResultado.setLogotipo( "logotipo" );
		pptResultado.setUsuarioId1( 1 );
		pptResultado.setEleccion1( "Falso" );
		pptResultado.setUsuarioId2( 2 );
		pptResultado.setEleccion2( "Verdadero" );
		pptResultado.setGanador( 1 );
		
		// Prueba 1: Regresa el ppt
		
		when ( pptRepository.findById( any ( Long.class ) ) ).thenReturn( Optional.of( pptResultado ) ) ;
		
		resultado = servicio.getPpt(pptId) ;
		
		assertEquals( true , pptResultado.equals(resultado) , "Debería regresar un ppt." );
		
		// Prueba 2: Regresa null
	
		when ( pptRepository.findById( any ( Long.class ) ) ).thenReturn( optionalVacio ) ;
		
		resultado = servicio.getPpt(pptId) ;
		
		assertEquals( false , pptResultado.equals(resultado) , "Debería regresar un null." );
		
	}

	@Test
	public void testUpdatePpt() {
		
		// Variables a utilizar
		
		long usuario1 ;
		long usuario2 ;
		
		Ppt pptResultado ;
		Ppt pptModificado ;
		
		Ppt prueba = new Ppt () ;
		
		Optional <Ppt> vacio ;
		
		// Condiciones iniciales
			
		usuario1 = 1 ;
		
		usuario2 = 2 ;
		
		vacio = Optional.empty() ;
				
		// Valores a comparar
		
		prueba = new Ppt () ;
		
		prueba.setPptId( 1 );
		prueba.setNombre( null );
		prueba.setCantidadDeUsuariosMaxima( 0 );
		prueba.setCantidadDeUsuariosMinima( 0 );
		prueba.setLogotipo( "logotipo" );
		prueba.setUsuarioId1(0);
		prueba.setEleccion1( "Piedra" );
		prueba.setUsuarioId2(0);
		prueba.setEleccion2( "Papel" );
		prueba.setGanador( 0 );
		
		pptResultado = new Ppt () ;
		
		pptResultado.setPptId( 1 );
		pptResultado.setNombre( "Piedra, papel o tijeras" );
		pptResultado.setCantidadDeUsuariosMaxima( 2 );
		pptResultado.setCantidadDeUsuariosMinima( 2 );
		pptResultado.setLogotipo( "logotipo" );
		pptResultado.setUsuarioId1( usuario1 );
		pptResultado.setEleccion1(null);
		pptResultado.setUsuarioId2(usuario2);
		pptResultado.setEleccion2(null);
		pptResultado.setGanador( 0 );
		
		pptModificado = new Ppt () ;
		
		pptModificado.setPptId( 1 );
		pptModificado.setNombre( "Piedra, papel o tijeras" );
		pptModificado.setCantidadDeUsuariosMaxima( 2 );
		pptModificado.setCantidadDeUsuariosMinima( 2 );
		pptModificado.setLogotipo( "logotipo" );
		pptModificado.setUsuarioId1( usuario1 );
		pptModificado.setEleccion1("Piedra");
		pptModificado.setUsuarioId2(usuario2);
		pptModificado.setEleccion2("Papel");
		pptModificado.setGanador( 2 );
		
		// Prueba1: Se actualiza el ppt.
		
		when ( pptRepository.findById( any ( Long.class ) ) ).thenReturn( Optional.of ( pptResultado ) ) ;
		when ( pptRepository.save( any ( Ppt.class ) ) ).thenReturn( pptModificado ) ;
		
		assertEquals( pptModificado , servicio.updatePpt(prueba) , "Deberían ser los mismo ppts." );
		
		// Prueba2: No se actualiza el ppt.
		
		when ( pptRepository.findById( any ( Long.class ) ) ).thenReturn( vacio ) ;
		
		assertEquals( null , servicio.updatePpt(prueba) , "Deberían ser los mismo ppts." );
		
	}

	@Test
	public void testDeletePpt() {

		// Variables a utilizar
		
		long pptId ;
				
		Optional<Ppt> optionalVacio = Optional.empty() ;
		
		boolean resultado ;
		
		Ppt pptResultado ;
		
		// Valores iniciales
		
		pptId = 1 ;
		
		pptResultado = new Ppt () ;
		
		pptResultado.setPptId( 1 );
		pptResultado.setNombre( "Piedra, papel o tijeras" );
		pptResultado.setCantidadDeUsuariosMaxima( 2 );
		pptResultado.setCantidadDeUsuariosMinima( 2 );
		pptResultado.setLogotipo( "logotipo" );
		pptResultado.setUsuarioId1( 1 );
		pptResultado.setEleccion1( "Falso" );
		pptResultado.setUsuarioId2( 2 );
		pptResultado.setEleccion2( "Verdadero" );
		pptResultado.setGanador( 1 );
		
		// Prueba 1: Se pudo borrar el ppt.
		
		when( pptRepository.findById( any( Long.class ) ) ).thenReturn( optionalVacio ) ;
		
		resultado = servicio.deletePpt(pptId) ;
		
		assertEquals( true , resultado , "Debería haberse eliminado el ppt." );
		
		// Prueba 2: No se pudo borrar el ppt.
		
		when( pptRepository.findById( any( Long.class ) ) ).thenReturn( Optional.of( pptResultado ) ) ;
		
		resultado = servicio.deletePpt(pptId) ;
		
		assertEquals( false , resultado , "No debería haberse eliminado el ppt." );
	
	}

	@Test
	public void testGetPpts() {

		Ppt ppt = new Ppt () ;
		
		ArrayList <Ppt> temporal = new ArrayList <Ppt> () ;
		
		temporal.add(ppt);
		
		Iterable <Ppt> iterador = temporal ;
		
		when ( pptRepository.findAll()).thenReturn ( iterador ) ;
		
		assertEquals( iterador , servicio.getPpts() , "Debería ser un iterable" );
		
	}

	@Test
	public void testDeletePpts() {

		// Variables a utilizar
						
		boolean resultado ;
		
		Ppt ppt = new Ppt () ;
		
		ArrayList <Ppt> temporal = new ArrayList<Ppt> () ;
		
		Iterable <Ppt> iterable = new ArrayList<Ppt> () ;
		
		// Valores iniciales
				
		
		// Prueba 1: Elimina todo.
		
		when ( pptRepository.findAll () ).thenReturn ( iterable ) ;
		
		resultado = servicio.deletePpts() ;
		
		assertTrue(resultado , "Debería estar vacío." );
		
		// Prueba 2: No logra eliminar todo.
	
		temporal.add(ppt) ;
		
		iterable = temporal ;

		when ( pptRepository.findAll () ).thenReturn ( iterable ) ;
		
		resultado = servicio.deletePpts() ;
		
		assertFalse(resultado , "Debería tener un elemento." );
	}

	@Test
	public void testGetNombreDelJuego() {

		assertEquals( "Piedra, papel o tijeras" , servicio.getNombreDelJuego() , "Deberia ser \"Piedra, papel o tijeras\"" );

	}

}
