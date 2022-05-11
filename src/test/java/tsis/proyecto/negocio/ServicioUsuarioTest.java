package tsis.proyecto.negocio;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.String;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import tsis.proyecto.api.dto.UsuarioDto;
import tsis.proyecto.datos.UsuarioRepository;

/**
 * 
 * Pruebas unitarias para la clase ServicioUsuario.
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@ExtendWith(MockitoExtension.class)
public class ServicioUsuarioTest {

	@Mock
	private UsuarioRepository  usuarioRepository ;
	
	@InjectMocks
	private ServicioUsuario servicio ; 
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	// Las pruebas.
	
	// Prueba la conversión de un UsuarioDto A un Usuario.
	
	@Test
	void testDtoToUsuario() {
		// Condiciones iniciales.
		
		UsuarioDto usuarioDto = null ;
		
		// Prueba 1: Se le pasa un UsuarioDto nullo.
		
		try {
			
			servicio.dtoToUsuario(usuarioDto);
			
		}
		
		catch ( NullPointerException ex ) {
			
			assertEquals( "Usuario nulo." , ex.getMessage() , "La escepción es la correcta." );
			
		}
		
		// Prueba 2: Se le pasa un UsuarioDto no nullo.

	}
/*
	@Test
	void testExistUsuario() {
		fail("Not yet implemented");
	}

	@Test
	void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByEmail() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testValidarPassword() {
		fail("Not yet implemented");
	}
*/
}
