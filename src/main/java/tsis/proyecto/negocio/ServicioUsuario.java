package tsis.proyecto.negocio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsis.proyecto.negocio.modelo.Usuario ;
import tsis.proyecto.datos.UsuarioRepository ;

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
