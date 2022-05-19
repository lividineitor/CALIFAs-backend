package tsis.proyecto.pruebasDeIntegracion;

import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import tsis.proyecto.api.dto.PptDto;
import tsis.proyecto.datos.PptRepository;
import tsis.proyecto.negocio.modelo.Ppt;

/**
 * 
 * Pruebas de integración para ppt
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class pptApiTest {

	@Autowired
	private TestRestTemplate restTemplate ;
	
	@Autowired
	private PptRepository pptRepository ;
	
	@Test
	public void testPostGeneral() {
		
		// Crear el contenido
		
		// Crear encabezado
		HttpHeaders headers = new HttpHeaders() ;
		
		headers.set("content-type", MediaType.APPLICATION_JSON.toString());
		
		// Crear la petición
		HttpEntity <String> request = new HttpEntity <> ( "{\"usuarioId1\": 1,\"usuarioId2\": 2}" , headers ) ;

		ResponseEntity <PptDto> responseEntity = restTemplate.exchange("/v1/ppts" ,  HttpMethod.POST , request , PptDto.class) ;
		
		// Valido el resultado
		assertEquals ( HttpStatus.CREATED , responseEntity.getStatusCode() ) ;
		
		// Valido que el ppt exista en la base de datos
		
		//Optional <Ppt> dto = pptRepository.findById( responseEntity.getBody().getPptId() ) ;
		
		//assertEquals ( responseEntity.getBody() , dto.get() ) ;
	}
	
	/*
	@Test
	public void testPostIndividual() {
		fail("Not yet implemented");
	}

*/
}
