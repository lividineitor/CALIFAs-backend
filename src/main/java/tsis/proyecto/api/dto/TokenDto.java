package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import tsis.proyecto.negocio.modelo.Token;
import tsis.proyecto.negocio.modelo.Usuario;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TokenDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class TokenDto   {
  @JsonProperty("tokenId")
  private Long tokenId = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("usuarioId")
  private Long usuarioId = null;
  
  @JsonProperty("creacion")
  private LocalDateTime creacion = null;
  
  @JsonProperty("duracion")
  private LocalTime duracion = null;
  
  public TokenDto tokenId(Long tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  /**
   * El identificador del Token.
   * @return tokenId
   **/
  @Schema(example = "1234", required = true, description = "El identificador del Token.")
      @NotNull

    @Valid
    public Long getTokenId() {
    return tokenId;
  }

  public void setTokenId(Long tokenId) {
    this.tokenId = tokenId;
  }

  public TokenDto token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Llave temporal del usuario.
   * @return token
   **/
  @Schema(example = "Adsfsl2342", required = true, description = "Llave temporal del usuario.")
      @NotNull

    public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  /**
   * El identificador del usuario.
   * @return usuarioId
   **/
  @Schema(example = "1234", required = true, description = "El identificador del usuario.")
      @NotNull

    @Valid
    public Long getUsuarioId() {
    return usuarioId;
  }

  public void setUsuarioId(Long usuarioId) {
    this.usuarioId = usuarioId;
  }

  public TokenDto usuarioId(long usuarioId) {
    this.usuarioId = usuarioId;
    return this;
  }
  
  /**
   * La fecha de creación.
   * @return creacion
   **/
  @Schema(example = "01/01/01:00:00:00", required = true, description = "La fecha de creación del token.")
      @NotNull

    @Valid
    public LocalDateTime getCreacion() {
    return creacion;
  }

  public void setCreacion(LocalDateTime creacion) {
    this.creacion = creacion;
  }

  public TokenDto creacion(LocalDateTime creacion) {
    this.creacion = creacion;
    return this;
  }
  
  /**
   * La duración del token.
   * @return duracion
   **/
  @Schema(example = "00:00:00", required = true, description = "La duración del token.")
      @NotNull

    @Valid
    public LocalTime getDuracion() {
    return duracion;
  }

  public void setDuracion(LocalTime duracion) {
    this.duracion = duracion;
  }

  public TokenDto duracion(LocalTime duracion) {
    this.duracion = duracion;
    return this;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenDto tokenDto = (TokenDto) o;
    return Objects.equals(this.tokenId, tokenDto.tokenId) &&
        Objects.equals(this.token, tokenDto.token) &&
        Objects.equals(this.usuarioId, tokenDto.usuarioId) &&
        Objects.equals(this.creacion, tokenDto.creacion) &&
        Objects.equals(this.duracion, tokenDto.duracion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, token, usuarioId , creacion , duracion );
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenDto {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    usuarioId: ").append(toIndentedString(usuarioId)).append("\n");
    sb.append("    creacion: ").append(toIndentedString(creacion)).append("\n");
    sb.append("    duracion: ").append(toIndentedString(duracion)).append("\n");
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
   * Convierte de Token a TokenDto
   * 
   * @param token El token a convertir
   * @return TokenDto
   * 
   */
  public TokenDto toDto ( Token token ) {
	
	  TokenDto dto = new TokenDto () ;
	  
	  dto.setTokenId ( token.getTokenId() ) ;
	  dto.setToken ( token.getToken() ) ;
	  dto.setUsuarioId ( token.getUsuarioId() ) ;
	  dto.setDuracion( token.getDuracion() ) ;
	  dto.setCreacion( token.getCreacion() ) ;

	  return dto ;
  
  }
}
