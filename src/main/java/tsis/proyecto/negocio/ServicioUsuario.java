package tsis.proyecto.negocio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsis.proyecto.negocio.modelo.Usuario ;
import tsis.proyecto.negocio.modelo.Token ;
import tsis.proyecto.datos.UsuarioRepository ;
import tsis.proyecto.api.dto.TokenDto;
import tsis.proyecto.api.dto.UsuarioDto ;

/**
 * 
 * Servicio que controla las actividades de los usuarios.
 * 
 * @author Alejandro Liv Barrera Nuncio
 *
 */

@Service
public class ServicioUsuario {

	@Autowired
	UsuarioRepository usuarioRepository ;
	
	@Autowired
	ServicioToken servicioToken ;

	/**
	 * 
	 * Convierte un UsuarioDto a Usuario
	 * 
	 * @param usuarioDto El UsuairoDto a convertir.
	 * @return Usuario El usuario convertido.
	 * 
	 */
	public Usuario dtoToUsuario ( UsuarioDto usuarioDto ) {

		Usuario usuarioRetorno = new Usuario () ;
		
		usuarioRetorno.setUsuarioId ( usuarioDto.getUsuarioId() ) ;
		usuarioRetorno.setNombre ( usuarioDto.getNombre() ) ;
		usuarioRetorno.setPassword ( usuarioDto.getPassword() ) ;
		usuarioRetorno.setEmail( usuarioDto.getEmail() ) ;
		
		usuarioRetorno.setRol( "Indefinido" );
		
		return usuarioRetorno ;
	}
	
	/**
	 * 
	 * Método que valida si existe un usuario que entra en la API.
	 * 
	 * @param usuario El usuario que quiero validar
	 * @return TokenDto
	 * 
	 */
	public TokenDto existUsuario ( Usuario usuario ) throws NullPointerException , IllegalArgumentException , SecurityException {
		TokenDto dto = new TokenDto () ;
		
		Usuario usuarioRecuperado = usuarioRepository.findByEmail( usuario.getEmail() ) ;
		
		if ( usuarioRecuperado != null ) {
			if ( usuarioRecuperado.getPassword ().equals( usuario.getPassword() ) ) {
				Token token ;
				
				if ( servicioToken.existTokenById(usuarioRecuperado.getUsuarioId()) )
					throw new SecurityException( "El usuario ya se encuentra activo en el sistema." ) ;
				
				else {
				token = servicioToken.createToken( usuarioRecuperado.getUsuarioId()) ;
				return dto.toDto ( token ) ;
				}
				
				
			}
			
			else {
				throw new IllegalArgumentException("Usuario o contraseña incorrectos.") ;
			}
		}
		
		else {
			throw new NullPointerException ( "Usuario no encontrado." ) ;
		}
				
	}
	
	/**
	 * 
	 * Método que busca a un usuario por su Id.
	 * 
	 * @param usuarioId Id del usuario a buscar.
	 * @return Usuario si se encontró o un usuario vacío de lo contrario.
	 * 
	 */	
	public Usuario findById( long usuarioId ) {
		
		Usuario usuarioARetornar = null ;
		Optional<Usuario> usuarioRecuperado ;
		
		usuarioRecuperado = usuarioRepository.findById ( usuarioId ) ;
		
		if ( !usuarioRecuperado.isEmpty() )
			usuarioARetornar = usuarioRecuperado.get() ;
		
		return usuarioARetornar ;
	}
	
	/**
	 * 
	 * Método que busca a un usuario por su email.
	 * 
	 * @param email Email del usuario a buscar.
	 * @return Usuario si se encontró o un usuario vacío de lo contrario.
	 * 
	 */	
	public Usuario findByEmail ( String email ) {
		
		Usuario usuarioRecuperado ;
		
		usuarioRecuperado = usuarioRepository.findByEmail ( email ) ;
		
		return usuarioRecuperado ;
	}
	
	/**
	 * 
	 * Método que busca a un usuario por su nombre.
	 * 
	 * @param nombre Nombre del usuario a buscar.
	 * @return Usuario si se encontró o un usuario vacío de lo contrario.
	 * 
	 */	
	public Usuario findByNombre ( String nombre ) {
		
		Usuario usuarioRecuperado ;
		
		usuarioRecuperado = usuarioRepository.findByNombre ( nombre ) ;
		
		return usuarioRecuperado ;
	}
	
	/**
	 * 
	 * Método que valida si el password de quien quiere entrar al sistema corresponde con un usuario ya registrado.
	 * @param usuarioSistemaPassword El password del usuario del sistema.
	 * @param usuarioExternoPassword El password del usuario que quiere ingresar.
	 * @return true si son idénticos, false de lo contrario.
	 */	
	public boolean validarPassword ( String usuarioSistemaPassword , String usuarioExternoPassword ) {
		return usuarioSistemaPassword.equals( usuarioExternoPassword ) ;
	}
	
}
