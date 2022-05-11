package tsis.proyecto.api.dto;

import java.util.Map;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PptDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class PptDto   {
  @JsonProperty("juegoId")
  private Long juegoId = null;

  @JsonProperty("usuarioId1")
  private Long usuarioId1 = null;

  @JsonProperty("usuarioId2")
  private Long usuarioId2 = null;

  public PptDto juegoId(Long juegoId) {
    this.juegoId = juegoId;
    return this;
  }

  /**
   * El identificador del juego.
   * @return juegoId
   **/
  @Schema(example = "1", required = true, description = "El identificador del juego.")
      @NotNull

    public Long getJuegoId() {
    return juegoId;
  }

  public void setJuegoId(Long juegoId) {
    this.juegoId = juegoId;
  }

  public PptDto usuarioId1(Long usuarioId1) {
    this.usuarioId1 = usuarioId1;
    return this;
  }

  /**
   * El identificador del usuario1.
   * @return usuarioId1
   **/
  @Schema(example = "1", required = true, description = "El identificador del usuario1.")
      @NotNull

    public Long getUsuarioId1() {
    return usuarioId1;
  }

  public void setUsuarioId1(Long usuarioId1) {
    this.usuarioId1 = usuarioId1;
  }

  public PptDto usuarioId2(Long usuarioId2) {
    this.usuarioId2 = usuarioId2;
    return this;
  }

  /**
   * El identificador del usuario2.
   * @return usuarioId2
   **/
  @Schema(example = "2", required = true, description = "El identificador del usuario2.")
      @NotNull

    public Long getUsuarioId2() {
    return usuarioId2;
  }

  public void setUsuarioId2(Long usuarioId2) {
    this.usuarioId2 = usuarioId2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PptDto pptDto = (PptDto) o;
    return Objects.equals(this.juegoId, pptDto.juegoId) &&
        Objects.equals(this.usuarioId1, pptDto.usuarioId1) &&
        Objects.equals(this.usuarioId2, pptDto.usuarioId2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(juegoId, usuarioId1, usuarioId2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PptDto {\n");
    
    sb.append("    juegoId: ").append(toIndentedString(juegoId)).append("\n");
    sb.append("    usuarioId1: ").append(toIndentedString(usuarioId1)).append("\n");
    sb.append("    usuarioId2: ").append(toIndentedString(usuarioId2)).append("\n");
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
   * Convierte un Map a dto.
   * 
   * @param mapa Map a convertir.
   * 
   * @return PptDto Dto convertido.
   */
  public PptDto mapToDto ( Map<String,Object> mapa ) {
	  
	  PptDto dto = new PptDto () ;
	  
	  dto.setJuegoId( ( long ) 0 );
	  
	  if ( mapa.containsKey("usuarioId1") ) {
		  if ( mapa.get( "usuarioId1" ) instanceof Integer ) {
			  mapa.put( "usuarioId1" , Long.valueOf( ( Integer ) mapa.get("usuarioId1") ) ) ;
		  }
		  
		  dto.setUsuarioId1( ( Long ) mapa.get("usuarioId1") );
		  mapa.remove ( "usuarioId1" ) ;
	  }
	  
	  if ( mapa.containsKey("usuarioId2") ) {
		  if ( mapa.get( "usuarioId2" ) instanceof Integer ) {
			  mapa.put( "usuarioId2" , Long.valueOf( ( Integer ) mapa.get("usuarioId2") ) ) ;
		  }
		  
		  dto.setUsuarioId2( ( Long ) mapa.get("usuarioId2") );
		  mapa.remove ( "usuarioId2" ) ;
	  }
	  
	  return dto ;
	  
  }
}
