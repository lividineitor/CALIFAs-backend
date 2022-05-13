package tsis.proyecto.api.dto;

import java.util.Map;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import tsis.proyecto.negocio.modelo.Ppt;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PptDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class PptDto   {
  @JsonProperty("pptId")
  private Long pptId = null;
  
  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("cantidadDeUsuariosMinima")
  private int cantidadDeUsuariosMinima = 0;
  
  @JsonProperty("cantidadDeUsuariosMaxima")
  private int cantidadDeUsuariosMaxima = 0;
  
  @JsonProperty("logotipo")
  private String logotipo = null;
  
  @JsonProperty("usuarioId1")
  private Long usuarioId1 = null;
  
  @JsonProperty("eleccion1")
  private String eleccion1 = null;
  
  @JsonProperty("usuarioId2")
  private Long usuarioId2 = null;
  
  @JsonProperty("eleccion2")
  private String eleccion2 = null;
  
  @JsonProperty("ganador")
  private Long ganador = null;
  
  public PptDto pptId(Long pptId) {
    this.pptId = pptId;
    return this;
  }

  /**
   * El identificador del juego.
   * @return pptId
   **/
  @Schema(example = "1", required = true, description = "El identificador del juego.")
      @NotNull

  public Long getPptId() {
    return pptId;
  }

  public void setPptId(Long pptId) {
    this.pptId = pptId;
  }

  public PptDto nombre(String nombre) {
	this.nombre = nombre;
	return this;
  }

  /**
  * El nombre del juego.
  * @return nombre
  **/
  @Schema(example = "Piedra, papel o tijeras", required = true, description = "El nombre del juego.")
  @NotNull

  public String getNombre() {
  return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public PptDto cantidadDeUsuariosMinima(int cantidadDeUsuariosMinima) {
	    this.cantidadDeUsuariosMinima = cantidadDeUsuariosMinima;
	    return this;
	  }

	  /**
	   * Cantidad mínima de usuarios.
	   * @return cantidadDeUsuariosMinima
	   **/
	  @Schema(example = "1", required = true, description = "Cantidad de usuarios mínima.")
	      @NotNull

	  public int getCantidadDeUsuariosMinima() {
	    return cantidadDeUsuariosMinima;
	  }

	  public void setCantidadDeUsuariosMinima(int cantidadDeUsuariosMinima) {
	    this.cantidadDeUsuariosMinima = cantidadDeUsuariosMinima;
	  }

	  public PptDto cantidadDeUsuariosMaxima(int cantidadDeUsuariosMaxima) {
		    this.cantidadDeUsuariosMaxima = cantidadDeUsuariosMaxima;
		    return this;
		  }

		  /**
		   * Cantidad de usuarios máxima.
		   * @return cantidadDeUsuariosMaxima
		   **/
		  @Schema(example = "2", required = true, description = "Cantidad de usuarios máxima.")
		      @NotNull

		  public int getCantidadDeUsuariosMaxima() {
		    return cantidadDeUsuariosMaxima;
		  }

		  public void setCantidadDeUsuariosMaxima(int cantidadDeUsuariosMaxima) {
		    this.cantidadDeUsuariosMaxima = cantidadDeUsuariosMaxima;
		  }
	  
  public PptDto logotipo(String logotipo) {
    this.logotipo = logotipo;
    return this;
  }

  /**
  * El logotipo del juego.
  * @return logotipo
  **/
  @Schema(example = "../logotipo.png", required = true, description = "El logotipo del juego.")
  @NotNull

  public String getLogotipo() {
	  return logotipo;
  }

  public void setLogotipo(String logotipo) {
    this.logotipo = logotipo;
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

  public PptDto eleccion1(String eleccion1) {
	  this.eleccion1 = eleccion1;
	  return this;
  }

  /**
  * La selección del usuario 1.
  * @return eleccion1
  **/
  @Schema(example = "piedra", required = true, description = "La elección del jugador 1.")
  @NotNull

  public String getEleccion1() {
	  return eleccion1;
  }

  public void setEleccion1(String eleccion1) {
    this.eleccion1 = eleccion1;
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

  public PptDto eleccion2(String eleccion2) {
	  this.eleccion2 = eleccion2;
	  return this;
  }

  /**
  * La selección del usuario 2.
  * @return eleccion2
  **/
  @Schema(example = "piedra", required = true, description = "La elección del jugador 2.")
  @NotNull

  public String getEleccion2() {
	  return eleccion2;
  }

  public void setEleccion2(String eleccion2) {
    this.eleccion2 = eleccion2;
  }
  
  public PptDto ganador (Long ganador) {
	    this.ganador = ganador;
	    return this;
	  }

	  /**
	   * El identificador del usuario que ganó.
	   * @return ganador
	   **/
	  @Schema(example = "2", required = true, description = "El identificador del usuario quw ganó.")
	      @NotNull

	    public Long getGanador() {
	    return ganador;
	  }

	  public void setGanador(Long ganador) {
	    this.ganador = ganador;
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
    return Objects.equals(this.pptId, pptDto.pptId) &&
            Objects.equals(this.nombre, pptDto.nombre) &&
            Objects.equals(this.cantidadDeUsuariosMinima, pptDto.cantidadDeUsuariosMinima) &&
            Objects.equals(this.cantidadDeUsuariosMaxima, pptDto.cantidadDeUsuariosMaxima) &&
            Objects.equals(this.logotipo, pptDto.logotipo) &&
        Objects.equals(this.usuarioId1, pptDto.usuarioId1) &&
        Objects.equals(this.eleccion1, pptDto.eleccion1) &&
        Objects.equals(this.usuarioId2, pptDto.usuarioId2) &&
        Objects.equals(this.eleccion2, pptDto.eleccion2) &&
        Objects.equals(this.ganador, pptDto.ganador) ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(pptId, nombre, cantidadDeUsuariosMinima, cantidadDeUsuariosMaxima, logotipo, usuarioId1, eleccion1, usuarioId2, eleccion2,ganador);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PptDto {\n");
    
    sb.append("    pptId: ").append(toIndentedString(pptId)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    cantidadDeUsuariosMinima: ").append(toIndentedString(cantidadDeUsuariosMinima)).append("\n");
    sb.append("    cantidadDeUsuariosMaxima: ").append(toIndentedString(cantidadDeUsuariosMaxima)).append("\n");
    sb.append("    logotipo: ").append(toIndentedString(logotipo)).append("\n");
    sb.append("    usuarioId1: ").append(toIndentedString(usuarioId1)).append("\n");
    sb.append("    eleccion1: ").append(toIndentedString(eleccion1)).append("\n");
    sb.append("    usuarioId2: ").append(toIndentedString(usuarioId2)).append("\n");
    sb.append("    eleccion2: ").append(toIndentedString(eleccion2)).append("\n");
    sb.append("    ganador: ").append(toIndentedString(ganador)).append("\n");
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
	  
	  dto.setPptId( ( long ) 0 );
	  
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
  
  /**
   * 
   * Convierte Ppt a PptDto
   * 
   * @param ppt Ppt a convertir.
   * 
   * @return PptDto Dto resultante.
   * 
   */
  
  public PptDto pptToDto ( Ppt ppt ) {
	  
	  PptDto dto = new PptDto () ;
	  
	  dto.setPptId( ppt.getPptId() );
	  dto.setNombre( ppt.getNombre());
	  dto.setCantidadDeUsuariosMinima( ppt.getCantidadDeUsuariosMinima());
	  dto.setCantidadDeUsuariosMaxima(ppt.getCantidadDeUsuariosMaxima());
	  dto.setLogotipo(ppt.getLogotipo());
	  dto.setUsuarioId1(ppt.getUsuarioId1());
	  dto.setEleccion1(ppt.getEleccion1());
	  dto.setUsuarioId2(ppt.getUsuarioId2());
	  dto.setEleccion2(ppt.getEleccion2());
	  dto.setGanador(ppt.getGanador());
	  
	  return dto ;
	  
  }
  
}
