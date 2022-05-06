package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V1TurnosBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class V1TurnosBody   {
  @JsonProperty("estadoDelTurno")
  private String estadoDelTurno = null;

  @JsonProperty("usuarioId")
  private Integer usuarioId = null;

  @JsonProperty("juegoId")
  private Integer juegoId = null;

  public V1TurnosBody estadoDelTurno(String estadoDelTurno) {
    this.estadoDelTurno = estadoDelTurno;
    return this;
  }

  /**
   * El estado del turno que puede ser \"Disponible\", \"En espera\", \"Activo\" y \"Expirado\".
   * @return estadoDelTurno
   **/
  @Schema(example = "Disponible", required = true, description = "El estado del turno que puede ser \"Disponible\", \"En espera\", \"Activo\" y \"Expirado\".")
      @NotNull

    public String getEstadoDelTurno() {
    return estadoDelTurno;
  }

  public void setEstadoDelTurno(String estadoDelTurno) {
    this.estadoDelTurno = estadoDelTurno;
  }

  public V1TurnosBody usuarioId(Integer usuarioId) {
    this.usuarioId = usuarioId;
    return this;
  }

  /**
   * El id del usuario que quiere jugar.
   * @return usuarioId
   **/
  @Schema(example = "1234", required = true, description = "El id del usuario que quiere jugar.")
      @NotNull

    public Integer getUsuarioId() {
    return usuarioId;
  }

  public void setUsuarioId(Integer usuarioId) {
    this.usuarioId = usuarioId;
  }

  public V1TurnosBody juegoId(Integer juegoId) {
    this.juegoId = juegoId;
    return this;
  }

  /**
   * El id del juego elegido.
   * @return juegoId
   **/
  @Schema(example = "1234", required = true, description = "El id del juego elegido.")
      @NotNull

    public Integer getJuegoId() {
    return juegoId;
  }

  public void setJuegoId(Integer juegoId) {
    this.juegoId = juegoId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TurnosBody v1TurnosBody = (V1TurnosBody) o;
    return Objects.equals(this.estadoDelTurno, v1TurnosBody.estadoDelTurno) &&
        Objects.equals(this.usuarioId, v1TurnosBody.usuarioId) &&
        Objects.equals(this.juegoId, v1TurnosBody.juegoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estadoDelTurno, usuarioId, juegoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TurnosBody {\n");
    
    sb.append("    estadoDelTurno: ").append(toIndentedString(estadoDelTurno)).append("\n");
    sb.append("    usuarioId: ").append(toIndentedString(usuarioId)).append("\n");
    sb.append("    juegoId: ").append(toIndentedString(juegoId)).append("\n");
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
