package tsis.proyecto.negocio;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsis.proyecto.datos.TokenRepository ;
import tsis.proyecto.negocio.modelo.Token ;

/**
 * 
 * Servicio que controla las actividades al momento de hacer login".
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@Service
public class ServicioToken {

	/**
	 * 
	 * Método para generar Tokens
	 * 
	 * @return Token
	 * 
	 */
	
	@Autowired
	TokenRepository tokenRepository ;
	
	public Token createToken ( long usuarioId ) {
		Token token = new Token () ;
		
		token.setToken ( cadenaRandom () ) ;
		token.setUsuarioId( usuarioId );
		token.setCreacion(LocalDateTime.now());
		token.setDuracion(LocalTime.of( 0 , 5 ));
		
		token = tokenRepository.save (token) ;
		
		return token ;
	}
	
	/**
	 * 
	 * Método que elimina un token por su usuario id
	 * 
	 * @param usuarioId El id del usuario.
	 * @return true si se eliminó, false si no
	 * 
	 */
	public boolean deleteTokenById ( long tokenId ) {
		
		tokenRepository.deleteById( tokenId );
		
		Optional <Token> token = tokenRepository.findById( tokenId ) ;
		
		if ( token.isEmpty() )
			return true ;
		
		else
			return false ;
		
	}
	
	/**
	 * 
	 * Método verificas si existe un token por usuario id
	 * @param usuarioId El id del usuario.
	 * @return boolean
	 * 
	 */
	public boolean existTokenById ( long usuarioId ) {
		
		Optional<Token> token = tokenRepository.findByUsuarioId(usuarioId);
		
		if ( !token.isEmpty()) {
			return true ;
		}
		
		else {
		 return false ;
		}
	}
	
	/**
	 * 
	 * Método regresa un token por usuarioId
	 * @param usuarioId El id del usuario.
	 * @return Token
	 * 
	 */
	public Token getToken ( long usuarioId ) {
		
		Optional<Token> token = tokenRepository.findByUsuarioId(usuarioId);
		
		if ( !token.isEmpty()) {
			return token.get() ;
		}
		
		else {
		 return null ;
		}
	}
	
	/**
	 * 
	 * Método para generar cadenas aleatorias.
	 * 
	 * @return String La cadena aleatoria.
	 * 
	 */
	private String cadenaRandom () {
		return "Cadena de prueba" ;
	}
	

	
}
