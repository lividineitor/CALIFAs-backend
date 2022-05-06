package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TurnoDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class TurnoDto   {
  @JsonProperty("turnoId")
  private BigDecimal turnoId = null;

  @JsonProperty("usuarioId")
  private BigDecimal usuarioId = null;

  @JsonProperty("juegoId")
  private BigDecimal juegoId = null;

  @JsonProperty("estadoDelTurno")
  private String estadoDelTurno = null;

  @JsonProperty("tiempoDeSolicitud")
  private String tiempoDeSolicitud = null;

  public TurnoDto turnoId(BigDecimal turnoId) {
    this.turnoId = turnoId;
    return this;
  }

  /**
   * El identificador del turno
   * @return turnoId
   **/
  @Schema(example = "1234", description = "El identificador del turno")
  
    @Valid
    public BigDecimal getTurnoId() {
    return turnoId;
  }

  public void setTurnoId(BigDecimal turnoId) {
    this.turnoId = turnoId;
  }

  public TurnoDto usuarioId(BigDecimal usuarioId) {
    this.usuarioId = usuarioId;
    return this;
  }

  /**
   * El identificador del usuario que quiere jugar
   * @return usuarioId
   **/
  @Schema(example = "1234", description = "El identificador del usuario que quiere jugar")
  
    @Valid
    public BigDecimal getUsuarioId() {
    return usuarioId;
  }

  public void setUsuarioId(BigDecimal usuarioId) {
    this.usuarioId = usuarioId;
  }

  public TurnoDto juegoId(BigDecimal juegoId) {
    this.juegoId = juegoId;
    return this;
  }

  /**
   * El identificador del juego que el usuario seleccionó
   * @return juegoId
   **/
  @Schema(example = "1234", description = "El identificador del juego que el usuario seleccionó")
  
    @Valid
    public BigDecimal getJuegoId() {
    return juegoId;
  }

  public void setJuegoId(BigDecimal juegoId) {
    this.juegoId = juegoId;
  }

  public TurnoDto estadoDelTurno(String estadoDelTurno) {
    this.estadoDelTurno = estadoDelTurno;
    return this;
  }

  /**
   * El estado del turno \"activo\", \"en espera\", \"expiró\".
   * @return estadoDelTurno
   **/
  @Schema(example = "activo", description = "El estado del turno \"activo\", \"en espera\", \"expiró\".")
  
    public String getEstadoDelTurno() {
    return estadoDelTurno;
  }

  public void setEstadoDelTurno(String estadoDelTurno) {
    this.estadoDelTurno = estadoDelTurno;
  }

  public TurnoDto tiempoDeSolicitud(String tiempoDeSolicitud) {
    this.tiempoDeSolicitud = tiempoDeSolicitud;
    return this;
  }

  /**
   * Hora en la que el usuario solicitó jugar
   * @return tiempoDeSolicitud
   **/
  @Schema(example = "1985-04-12T23:20:50.52Z", description = "Hora en la que el usuario solicitó jugar")
  
    public String getTiempoDeSolicitud() {
    return tiempoDeSolicitud;
  }

  public void setTiempoDeSolicitud(String tiempoDeSolicitud) {
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
    TurnoDto turnoDto = (TurnoDto) o;
    return Objects.equals(this.turnoId, turnoDto.turnoId) &&
        Objects.equals(this.usuarioId, turnoDto.usuarioId) &&
        Objects.equals(this.juegoId, turnoDto.juegoId) &&
        Objects.equals(this.estadoDelTurno, turnoDto.estadoDelTurno) &&
        Objects.equals(this.tiempoDeSolicitud, turnoDto.tiempoDeSolicitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(turnoId, usuarioId, juegoId, estadoDelTurno, tiempoDeSolicitud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TurnoDto {\n");
    
    sb.append("    turnoId: ").append(toIndentedString(turnoId)).append("\n");
    sb.append("    usuarioId: ").append(toIndentedString(usuarioId)).append("\n");
    sb.append("    juegoId: ").append(toIndentedString(juegoId)).append("\n");
    sb.append("    estadoDelTurno: ").append(toIndentedString(estadoDelTurno)).append("\n");
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
