package tsis.proyecto.api;

import tsis.proyecto.api.dto.ColaDto;
import tsis.proyecto.api.dto.ColaIdTurnosBody;
import tsis.proyecto.api.dto.Error;
import tsis.proyecto.api.dto.InlineResponse200;
import tsis.proyecto.api.dto.InlineResponse2002;
import tsis.proyecto.api.dto.InlineResponse2003;
import tsis.proyecto.api.dto.InlineResponse2004;
import tsis.proyecto.api.dto.JuegoDto;
import tsis.proyecto.api.dto.JuegosJuegoIdBody;
import tsis.proyecto.api.dto.LoginDto;
import tsis.proyecto.api.dto.PptDto;
import tsis.proyecto.api.dto.PptsDto;
import tsis.proyecto.api.dto.PptsJuegoIdBody;
import tsis.proyecto.api.dto.PreferenciaDto;
import tsis.proyecto.api.dto.PreferenciasPreferenciasIdBody;
import tsis.proyecto.api.dto.TokenDto;
import tsis.proyecto.api.dto.TurnoDto;
import tsis.proyecto.api.dto.TurnosTurnoIdBody;
import tsis.proyecto.api.dto.UsuarioDto;
import tsis.proyecto.api.dto.UsuariosUsuarioIdBody;
import tsis.proyecto.api.dto.V1JuegosBody;
import tsis.proyecto.api.dto.V1PptsBody;
import tsis.proyecto.api.dto.V1TurnosBody;
import tsis.proyecto.api.dto.V1UsuariosBody;
import tsis.proyecto.negocio.*;
import tsis.proyecto.negocio.modelo.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")
@CrossOrigin
@RestController
public class V1ApiController implements V1Api {

	// Todas las inyecciones
	
	@Autowired
	ServicioJuego servicioJuego ;
	
	@Autowired
	ServicioPpt servicioPpt ;
	
	@Autowired
	ServicioUsuario servicioUsuario ;

	
	
    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> actionPpt(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Usuario que realiza acción." ,required=true,schema=@Schema()) @Valid @RequestParam(value = "usuarioId", required = true) Integer usuarioId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Acción a realizar (\"eleccion\" , \"continuar\")." ,required=true,schema=@Schema()) @Valid @RequestParam(value = "action", required = true) String action,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Lo que el usuario eligió(Para \"eleccion\": \"piedra\", \"papel\" o \"tijeras\"; para \"continuar\": \"true\" o \"false\")." ,required=true,schema=@Schema()) @Valid @RequestParam(value = "eleccion", required = true) String eleccion,@Parameter(in = ParameterIn.PATH, description = "El id del juego.", required=true, schema=@Schema()) @PathVariable("juegoId") Integer juegoId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PptsJuegoIdBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> actionVolados(@Parameter(in = ParameterIn.PATH, description = "Identificador del juego.", required=true, schema=@Schema()) @PathVariable("juegoId") Integer juegoId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Identificador del usuario." ,required=true,schema=@Schema()) @Valid @RequestParam(value = "usuarioId", required = true) Integer usuarioId,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Eleccion del jugador en la partida." ,required=true,schema=@Schema()) @Valid @RequestParam(value = "eleccion", required = true) String eleccion,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Accion que toma el jugador." ,required=true,schema=@Schema()) @Valid @RequestParam(value = "accion", required = true) Boolean accion) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ColaDto> createCola() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ColaDto>(objectMapper.readValue("{\n  \"colaId\" : 1234,\n  \"teimpoDeExpiracion\" : \"00:02:00\",\n  \"turnos\" : {\n    \"tiempoDeSolicitud\" : 0,\n    \"juegoId\" : 1234,\n    \"estadoDelTurno\" : \"Disponible\",\n    \"usuarioId\" : 1234,\n    \"turnoId\" : 1234\n  },\n  \"maximoDeJugadores\" : 20,\n  \"estados\" : [ \"Acvtivo\", \"Disponible\", \"En espera\", \"Expirado\" ]\n}", ColaDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ColaDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ColaDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JuegoDto> createJuego(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Map<String,Object> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            /*try {
            	
            	JuegoDto juegoDto = new JuegoDto() ;
            	
            	juegoDto = juegoDto.mapToDto(body) ;
            	
            	Juego juego = servicioJuego.dtoToJuego(juegoDto) ;
            	
            	juego = servicioJuego.createJuego(juego) ;
            	
            	juegoDto ;
            	
            	return ResponseEntity.status(HttpStatus.CREATED).body(juegoDto) ;
            }*/
        }

        return new ResponseEntity<JuegoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PptDto> createPpt(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Map <String,Object> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	
        	PptDto dto = new PptDto () ;
        	
        	dto = dto.mapToDto(body) ;
        	        	
            try {
            	
            	Ppt ppt = servicioPpt.createPpt( dto.getUsuarioId1() , dto.getUsuarioId1() ) ;
            	
            	if ( ppt != null ) {
            		dto = dto.pptToDto(ppt) ;
            		return ResponseEntity.status( HttpStatus.CREATED ).body( dto ) ;
            		
            	}
            	
            	else
            		throw new NullPointerException() ;

            } catch (NullPointerException ex) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR , ex.getMessage() );
            }
        }
        
        else
        	throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED) ;
    }

    public ResponseEntity<TurnoDto> createTurno(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody V1TurnosBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TurnoDto>(objectMapper.readValue("{\n  \"tiempoDeSolicitud\" : \"1985-04-12T23:20:50.52Z\",\n  \"juegoId\" : 1234,\n  \"estadoDelTurno\" : \"activo\",\n  \"usuarioId\" : 1234,\n  \"turnoId\" : 1234\n}", TurnoDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TurnoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TurnoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UsuarioDto> createUsuario(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UsuarioDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	Usuario usuario = servicioUsuario.dtoToUsuario(body) ;
            	
            	usuario = servicioUsuario.createUsuario(usuario) ;
            	
            	UsuarioDto dto = new UsuarioDto () ;
            	dto = dto.toDto(usuario) ;
            	
            	return ResponseEntity.status(HttpStatus.CREATED).body(dto) ;
            	
            } 
            
            catch ( SecurityException ex ) {
            	throw new ResponseStatusException(HttpStatus.CONFLICT , ex.getMessage()) ;
            }
            
            catch (Exception ex) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
            }
        }

        return new ResponseEntity<UsuarioDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteColas() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteJuego(@Parameter(in = ParameterIn.PATH, description = "El id del juego.", required=true, schema=@Schema()) @PathVariable("juegoId") Integer juegoId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletePpt(@Parameter(in = ParameterIn.PATH, description = "El id del juego.", required=true, schema=@Schema()) @PathVariable("pptId") Long pptId) {
        String accept = request.getHeader("Accept");
        
        if ( servicioPpt.getPpt( pptId )  == null )
        	throw new ResponseStatusException(HttpStatus.NOT_FOUND) ;
        
        if ( servicioPpt.deletePpt( pptId ) )
        	return new ResponseEntity<Void>(HttpStatus.NO_CONTENT) ;
        
        else
        	throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR) ;        
    }

    public ResponseEntity<Void> deletePpts() {
        String accept = request.getHeader("Accept");
        
        if ( !servicioPpt.getPpts().iterator().hasNext() )
        	throw new ResponseStatusException(HttpStatus.NOT_FOUND) ;
        
        if ( servicioPpt.deletePpts() )
        	return new ResponseEntity<Void>(HttpStatus.NO_CONTENT) ;
        
        else
        	throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR) ; 
    }

    public ResponseEntity<Void> deleteTurno(@Parameter(in = ParameterIn.PATH, description = "El id del turno del usuario.", required=true, schema=@Schema()) @PathVariable("turnoId") Integer turnoId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteTurnos() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUsuario(@Parameter(in = ParameterIn.PATH, description = "El id del usuario.", required=true, schema=@Schema()) @PathVariable("usuarioId") Integer usuarioId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TokenDto> existUsuario(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LoginDto body) {    	
    	String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
       	
        	Usuario usuario = new Usuario () ;
        	
        	usuario.setEmail(body.getEmail());
        	usuario.setPassword(body.getPassword()) ;
        	
        	try {
        		 TokenDto tokenDto = servicioUsuario.existUsuario( usuario ) ;
            	return ResponseEntity.status(HttpStatus.OK).body(tokenDto);
        	}
        	
        	catch ( IllegalArgumentException ex ) {
            	throw new ResponseStatusException(HttpStatus.UNAUTHORIZED , ex.getMessage() );
        	}
        	
        	catch ( SecurityException ex ) {
            	throw new ResponseStatusException( HttpStatus.CONFLICT, ex.getMessage() );
        	}
        	
        	catch ( NullPointerException ex ) {
            	throw new ResponseStatusException( HttpStatus.NOT_FOUND, ex.getMessage() );
        	}
        	
        	catch ( Exception ex ) {
            	throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED , ex.getLocalizedMessage());
        	}
        }
        
        else
        	throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
        
    }

    public ResponseEntity<InlineResponse2003> getColas() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("{\n  \"colas\" : [ {\n    \"colaId\" : 1234,\n    \"teimpoDeExpiracion\" : \"00:02:00\",\n    \"turnos\" : {\n      \"tiempoDeSolicitud\" : 0,\n      \"juegoId\" : 1234,\n      \"estadoDelTurno\" : \"Disponible\",\n      \"usuarioId\" : 1234,\n      \"turnoId\" : 1234\n    },\n    \"maximoDeJugadores\" : 20,\n    \"estados\" : [ \"Acvtivo\", \"Disponible\", \"En espera\", \"Expirado\" ]\n  }, {\n    \"colaId\" : 1234,\n    \"teimpoDeExpiracion\" : \"00:02:00\",\n    \"turnos\" : {\n      \"tiempoDeSolicitud\" : 0,\n      \"juegoId\" : 1234,\n      \"estadoDelTurno\" : \"Disponible\",\n      \"usuarioId\" : 1234,\n      \"turnoId\" : 1234\n    },\n    \"maximoDeJugadores\" : 20,\n    \"estados\" : [ \"Acvtivo\", \"Disponible\", \"En espera\", \"Expirado\" ]\n  } ]\n}", InlineResponse2003.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JuegoDto> getJuego(@Parameter(in = ParameterIn.PATH, description = "El id del juego.", required=true, schema=@Schema()) @PathVariable("juegoId") Integer juegoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JuegoDto>(objectMapper.readValue("{\n  \"juegoId\" : 1234,\n  \"logotipo\" : \"https://drive.google.com/drive/folders/1-hiP65nxgpan3OoZXQXdCRPT2i6C2YzX\",\n  \"cantidadDeUsuariosMinima\" : 2,\n  \"nombre\" : \"Juego1\",\n  \"cantidadDeUsuariosMaxima\" : 10,\n  \"esperaEntreTurnos\" : \"0:05:00\"\n}", JuegoDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JuegoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JuegoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2002> getJuegos() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{\n  \"juegos\" : [ {\n    \"juegoId\" : 1234,\n    \"logotipo\" : \"https://drive.google.com/drive/folders/1-hiP65nxgpan3OoZXQXdCRPT2i6C2YzX\",\n    \"cantidadDeUsuariosMinima\" : 2,\n    \"nombre\" : \"Juego1\",\n    \"cantidadDeUsuariosMaxima\" : 10,\n    \"esperaEntreTurnos\" : \"0:05:00\"\n  }, {\n    \"juegoId\" : 1234,\n    \"logotipo\" : \"https://drive.google.com/drive/folders/1-hiP65nxgpan3OoZXQXdCRPT2i6C2YzX\",\n    \"cantidadDeUsuariosMinima\" : 2,\n    \"nombre\" : \"Juego1\",\n    \"cantidadDeUsuariosMaxima\" : 10,\n    \"esperaEntreTurnos\" : \"0:05:00\"\n  } ]\n}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PptDto> getPpt(@Parameter(in = ParameterIn.PATH, description = "El id del juego.", required=true, schema=@Schema()) @PathVariable("pptId") Long pptId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Ppt ppt = servicioPpt.getPpt( pptId ) ;
            	
            if ( ppt != null ) {
            	PptDto dto = new PptDto () ;
            	dto = dto.pptToDto(ppt);
            	return ResponseEntity.status(HttpStatus.OK).body(dto) ;
            }
            
            else
            	throw new ResponseStatusException(HttpStatus.NOT_FOUND) ;
        }
        
        else
        	throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PptsDto> getPpts() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            
        	PptsDto dto = new PptsDto () ;
        	
        	Iterable <Ppt> lista = servicioPpt.getPpts() ;
        	
        	if ( lista.iterator().hasNext() ) {
        		
        		for ( Ppt elemento : lista )
        			dto.addPptsItem(elemento) ;
        		
        		return ResponseEntity.status(HttpStatus.OK).body(dto) ;
        		
        	}
        	
        	else
        		throw new ResponseStatusException(HttpStatus.NOT_FOUND) ;
        }

        return new ResponseEntity<PptsDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PreferenciaDto> getPreferencias() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PreferenciaDto>(objectMapper.readValue("{\n  \"tiempoDeSesion\" : \"20\",\n  \"tiempoDeExpiracion\" : \"10\",\n  \"urlDestino\" : \"https://fulanitos.org\",\n  \"esperaEntreTurnos\" : \"5\",\n  \"preferenciasId\" : 1234\n}", PreferenciaDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PreferenciaDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PreferenciaDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TurnoDto> getTurno(@Parameter(in = ParameterIn.PATH, description = "El id del turno del usuario.", required=true, schema=@Schema()) @PathVariable("turnoId") Integer turnoId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TurnoDto>(objectMapper.readValue("{\n  \"tiempoDeSolicitud\" : \"1985-04-12T23:20:50.52Z\",\n  \"juegoId\" : 1234,\n  \"estadoDelTurno\" : \"activo\",\n  \"usuarioId\" : 1234,\n  \"turnoId\" : 1234\n}", TurnoDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TurnoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TurnoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2004> getTurnos() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("{\n  \"turnos\" : [ {\n    \"tiempoDeSolicitud\" : \"1985-04-12T23:20:50.52Z\",\n    \"juegoId\" : 1234,\n    \"estadoDelTurno\" : \"activo\",\n    \"usuarioId\" : 1234,\n    \"turnoId\" : 1234\n  }, {\n    \"tiempoDeSolicitud\" : \"1985-04-12T23:20:50.52Z\",\n    \"juegoId\" : 1234,\n    \"estadoDelTurno\" : \"activo\",\n    \"usuarioId\" : 1234,\n    \"turnoId\" : 1234\n  } ]\n}", InlineResponse2004.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2004>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2004>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UsuarioDto> getUsuario(@Parameter(in = ParameterIn.PATH, description = "El id del usuario.", required=true, schema=@Schema()) @PathVariable("usuarioId") Long usuarioId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	
        	Usuario usuarioTemporal ;
        	
        	usuarioTemporal = servicioUsuario.findById ( usuarioId ) ;
        	
        	if ( usuarioTemporal != null ) {
        		UsuarioDto dto = new UsuarioDto () ;
        	
    			return new ResponseEntity<UsuarioDto>(dto.toDto(usuarioTemporal) , HttpStatus.OK);
    			
        	}
        }

        return new ResponseEntity<UsuarioDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> getUsuarios() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"usuarios\" : [ {\n    \"password\" : \"losFulanitosSonPersonas\",\n    \"usuarioId\" : 1234,\n    \"nombre\" : \"fulanito\",\n    \"email\" : \"fulanito@de.tal\"\n  }, {\n    \"password\" : \"losFulanitosSonPersonas\",\n    \"usuarioId\" : 1234,\n    \"nombre\" : \"fulanito\",\n    \"email\" : \"fulanito@de.tal\"\n  } ]\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JuegoDto> updateJuego(@Parameter(in = ParameterIn.PATH, description = "El id del juego.", required=true, schema=@Schema()) @PathVariable("juegoId") Integer juegoId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody JuegosJuegoIdBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JuegoDto>(objectMapper.readValue("{\n  \"juegoId\" : 1234,\n  \"logotipo\" : \"https://drive.google.com/drive/folders/1-hiP65nxgpan3OoZXQXdCRPT2i6C2YzX\",\n  \"cantidadDeUsuariosMinima\" : 2,\n  \"nombre\" : \"Juego1\",\n  \"cantidadDeUsuariosMaxima\" : 10,\n  \"esperaEntreTurnos\" : \"0:05:00\"\n}", JuegoDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JuegoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JuegoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePreferencias(@Parameter(in = ParameterIn.PATH, description = "El id de la preferencia.", required=true, schema=@Schema()) @PathVariable("preferenciasId") Integer preferenciasId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PreferenciasPreferenciasIdBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TurnoDto> updateTurno(@Parameter(in = ParameterIn.PATH, description = "El id del turno del usuario.", required=true, schema=@Schema()) @PathVariable("turnoId") Integer turnoId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody TurnosTurnoIdBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TurnoDto>(objectMapper.readValue("{\n  \"tiempoDeSolicitud\" : \"1985-04-12T23:20:50.52Z\",\n  \"juegoId\" : 1234,\n  \"estadoDelTurno\" : \"activo\",\n  \"usuarioId\" : 1234,\n  \"turnoId\" : 1234\n}", TurnoDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TurnoDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TurnoDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUsuario(@Parameter(in = ParameterIn.PATH, description = "El id del usuario.", required=true, schema=@Schema()) @PathVariable("usuarioId") Integer usuarioId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UsuariosUsuarioIdBody body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UsuarioDto> v1ColasColaIdTurnosPost(@Parameter(in = ParameterIn.PATH, description = "El id del usuario.", required=true, schema=@Schema()) @PathVariable("colaId") Integer colaId,@Parameter(in = ParameterIn.QUERY, description = "Id del usuario." ,schema=@Schema()) @Valid @RequestParam(value = "usuarioId", required = false) Integer usuarioId,@Parameter(in = ParameterIn.QUERY, description = "Añade(add), elimina(delete) o modifica(update) un turno a la cola." ,schema=@Schema()) @Valid @RequestParam(value = "action", required = false) String action,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ColaIdTurnosBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UsuarioDto>(objectMapper.readValue("{\n  \"password\" : \"losFulanitosSonPersonas\",\n  \"usuarioId\" : 1234,\n  \"nombre\" : \"fulanito\",\n  \"email\" : \"fulanito@de.tal\"\n}", UsuarioDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UsuarioDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UsuarioDto>(HttpStatus.NOT_IMPLEMENTED);
    }

}
