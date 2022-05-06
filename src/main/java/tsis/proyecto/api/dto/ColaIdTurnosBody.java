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
 * ColaIdTurnosBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class ColaIdTurnosBody   {
  @JsonProperty("usuarioId")
  private BigDecimal usuarioId = null;

  @JsonProperty("juegoId")
  private BigDecimal juegoId = null;

  @JsonProperty("estadoDelTurno")
  private String estadoDelTurno = null;

  @JsonProperty("tiempoDeSolicitud")
  private String tiempoDeSolicitud = null;

  public ColaIdTurnosBody usuarioId(BigDecimal usuarioId) {
    this.usuarioId = usuarioId;
    return this;
  }

  /**
   * El identificador del usuario que quiere jugar.
   * @return usuarioId
   **/
  @Schema(example = "1234", required = true, description = "El identificador del usuario que quiere jugar.")
      @NotNull

    @Valid
    public BigDecimal getUsuarioId() {
    return usuarioId;
  }

  public void setUsuarioId(BigDecimal usuarioId) {
    this.usuarioId = usuarioId;
  }

  public ColaIdTurnosBody juegoId(BigDecimal juegoId) {
    this.juegoId = juegoId;
    return this;
  }

  /**
   * El identificador del juego que el usuario seleccionó.
   * @return juegoId
   **/
  @Schema(example = "1234", required = true, description = "El identificador del juego que el usuario seleccionó.")
      @NotNull

    @Valid
    public BigDecimal getJuegoId() {
    return juegoId;
  }

  public void setJuegoId(BigDecimal juegoId) {
    this.juegoId = juegoId;
  }

  public ColaIdTurnosBody estadoDelTurno(String estadoDelTurno) {
    this.estadoDelTurno = estadoDelTurno;
    return this;
  }

  /**
   * El estado del turno \"Activo\", \"Disponible\", \"En espera\" y \"Expiró\".
   * @return estadoDelTurno
   **/
  @Schema(example = "activo", required = true, description = "El estado del turno \"Activo\", \"Disponible\", \"En espera\" y \"Expiró\".")
      @NotNull

    public String getEstadoDelTurno() {
    return estadoDelTurno;
  }

  public void setEstadoDelTurno(String estadoDelTurno) {
    this.estadoDelTurno = estadoDelTurno;
  }

  public ColaIdTurnosBody tiempoDeSolicitud(String tiempoDeSolicitud) {
    this.tiempoDeSolicitud = tiempoDeSolicitud;
    return this;
  }

  /**
   * Hora en la que el usuario solicitó jugar.
   * @return tiempoDeSolicitud
   **/
  @Schema(example = "1985-04-12T23:20:50.52Z", required = true, description = "Hora en la que el usuario solicitó jugar.")
      @NotNull

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
    ColaIdTurnosBody colaIdTurnosBody = (ColaIdTurnosBody) o;
    return Objects.equals(this.usuarioId, colaIdTurnosBody.usuarioId) &&
        Objects.equals(this.juegoId, colaIdTurnosBody.juegoId) &&
        Objects.equals(this.estadoDelTurno, colaIdTurnosBody.estadoDelTurno) &&
        Objects.equals(this.tiempoDeSolicitud, colaIdTurnosBody.tiempoDeSolicitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usuarioId, juegoId, estadoDelTurno, tiempoDeSolicitud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColaIdTurnosBody {\n");
    
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
