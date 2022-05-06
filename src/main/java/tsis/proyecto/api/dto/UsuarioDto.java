package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import tsis.proyecto.negocio.modelo.Usuario;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UsuarioDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class UsuarioDto   {
  @JsonProperty("usuarioId")
  private Long usuarioId = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("password")
  private String password = null;

  public UsuarioDto usuarioId(Long usuarioId) {
    this.usuarioId = usuarioId;
    return this;
  }

  /**
   * El identificador de usuario.
   * @return usuarioId
   **/
  @Schema(example = "1234", required = true, description = "El identificador de usuario.")
      @NotNull

    public Long getUsuarioId() {
    return usuarioId;
  }

  public void setUsuarioId(Long usuarioId) {
    this.usuarioId = usuarioId;
  }

  public UsuarioDto nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * El nombre de usuario.
   * @return nombre
   **/
  @Schema(example = "fulanito", required = true, description = "El nombre de usuario.")
      @NotNull

    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public UsuarioDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * El correo de la cuenta.
   * @return email
   **/
  @Schema(example = "fulanito@de.tal", required = true, description = "El correo de la cuenta.")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UsuarioDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * La contraseña del usuario.
   * @return password
   **/
  @Schema(example = "losFulanitosSonPersonas", required = true, description = "La contraseña del usuario.")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioDto usuarioDto = (UsuarioDto) o;
    return Objects.equals(this.usuarioId, usuarioDto.usuarioId) &&
        Objects.equals(this.nombre, usuarioDto.nombre) &&
        Objects.equals(this.email, usuarioDto.email) &&
        Objects.equals(this.password, usuarioDto.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usuarioId, nombre, email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioDto {\n");
    
    sb.append("    usuarioId: ").append(toIndentedString(usuarioId)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
  /**
   * 
   * Convierte de Usuario a UsuarioDto
   * 
   * @param usuario El usuario a convertir
   * @return UsuarioDto
   * 
   */
  public UsuarioDto toDto ( Usuario usuario ) {
	
	  UsuarioDto dto = new UsuarioDto () ;
	  
	  dto.setUsuarioId(usuario.getUsuarioId());
	  dto.setNombre(usuario.getNombre());
	  dto.setPassword(usuario.getPassword());
	  dto.setEmail(usuario.getEmail());
	  
	  return dto ;
  
  }
}
