package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ColaDtoTurnos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class ColaDtoTurnos   {
  @JsonProperty("turnoId")
  private Integer turnoId = null;

  @JsonProperty("estadoDelTurno")
  private String estadoDelTurno = null;

  @JsonProperty("usuarioId")
  private Integer usuarioId = null;

  @JsonProperty("juegoId")
  private Integer juegoId = null;

  @JsonProperty("tiempoDeSolicitud")
  private Integer tiempoDeSolicitud = null;

  public ColaDtoTurnos turnoId(Integer turnoId) {
    this.turnoId = turnoId;
    return this;
  }

  /**
   * Get turnoId
   * @return turnoId
   **/
  @Schema(example = "1234", description = "")
  
    public Integer getTurnoId() {
    return turnoId;
  }

  public void setTurnoId(Integer turnoId) {
    this.turnoId = turnoId;
  }

  public ColaDtoTurnos estadoDelTurno(String estadoDelTurno) {
    this.estadoDelTurno = estadoDelTurno;
    return this;
  }

  /**
   * Get estadoDelTurno
   * @return estadoDelTurno
   **/
  @Schema(example = "Disponible", description = "")
  
    public String getEstadoDelTurno() {
    return estadoDelTurno;
  }

  public void setEstadoDelTurno(String estadoDelTurno) {
    this.estadoDelTurno = estadoDelTurno;
  }

  public ColaDtoTurnos usuarioId(Integer usuarioId) {
    this.usuarioId = usuarioId;
    return this;
  }

  /**
   * Get usuarioId
   * @return usuarioId
   **/
  @Schema(example = "1234", description = "")
  
    public Integer getUsuarioId() {
    return usuarioId;
  }

  public void setUsuarioId(Integer usuarioId) {
    this.usuarioId = usuarioId;
  }

  public ColaDtoTurnos juegoId(Integer juegoId) {
    this.juegoId = juegoId;
    return this;
  }

  /**
   * Get juegoId
   * @return juegoId
   **/
  @Schema(example = "1234", description = "")
  
    public Integer getJuegoId() {
    return juegoId;
  }

  public void setJuegoId(Integer juegoId) {
    this.juegoId = juegoId;
  }

  public ColaDtoTurnos tiempoDeSolicitud(Integer tiempoDeSolicitud) {
    this.tiempoDeSolicitud = tiempoDeSolicitud;
    return this;
  }

  /**
   * Get tiempoDeSolicitud
   * @return tiempoDeSolicitud
   **/
  @Schema(description = "")
  
    public Integer getTiempoDeSolicitud() {
    return tiempoDeSolicitud;
  }

  public void setTiempoDeSolicitud(Integer tiempoDeSolicitud) {
    this.tiempoDeSolicitud = tiempoDeSolicitud;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColaDtoTurnos colaDtoTurnos = (ColaDtoTurnos) o;
    return Objects.equals(this.turnoId, colaDtoTurnos.turnoId) &&
        Objects.equals(this.estadoDelTurno, colaDtoTurnos.estadoDelTurno) &&
        Objects.equals(this.usuarioId, colaDtoTurnos.usuarioId) &&
        Objects.equals(this.juegoId, colaDtoTurnos.juegoId) &&
        Objects.equals(this.tiempoDeSolicitud, colaDtoTurnos.tiempoDeSolicitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(turnoId, estadoDelTurno, usuarioId, juegoId, tiempoDeSolicitud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColaDtoTurnos {\n");
    
    sb.append("    turnoId: ").append(toIndentedString(turnoId)).append("\n");
    sb.append("    estadoDelTurno: ").append(toIndentedString(estadoDelTurno)).append("\n");
    sb.append("    usuarioId: ").append(toIndentedString(usuarioId)).append("\n");
    sb.append("    juegoId: ").append(toIndentedString(juegoId)).append("\n");
    sb.append("    tiempoDeSolicitud: ").append(toIndentedString(tiempoDeSolicitud)).append("\n");
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
}
