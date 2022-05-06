package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TurnosTurnoIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class TurnosTurnoIdBody   {
  @JsonProperty("usuarioId")
  private Integer usuarioId = null;

  @JsonProperty("juegoId")
  private Integer juegoId = null;

  @JsonProperty("estadoDelTurno")
  private String estadoDelTurno = null;

  public TurnosTurnoIdBody usuarioId(Integer usuarioId) {
    this.usuarioId = usuarioId;
    return this;
  }

  /**
   * El id del usuario.
   * @return usuarioId
   **/
  @Schema(example = "1234", description = "El id del usuario.")
  
    public Integer getUsuarioId() {
    return usuarioId;
  }

  public void setUsuarioId(Integer usuarioId) {
    this.usuarioId = usuarioId;
  }

  public TurnosTurnoIdBody juegoId(Integer juegoId) {
    this.juegoId = juegoId;
    return this;
  }

  /**
   * El id del juego.
   * @return juegoId
   **/
  @Schema(example = "1234", description = "El id del juego.")
  
    public Integer getJuegoId() {
    return juegoId;
  }

  public void setJuegoId(Integer juegoId) {
    this.juegoId = juegoId;
  }

  public TurnosTurnoIdBody estadoDelTurno(String estadoDelTurno) {
    this.estadoDelTurno = estadoDelTurno;
    return this;
  }

  /**
   * El estado del turno.
   * @return estadoDelTurno
   **/
  @Schema(example = "activo", description = "El estado del turno.")
  
    public String getEstadoDelTurno() {
    return estadoDelTurno;
  }

  public void setEstadoDelTurno(String estadoDelTurno) {
    this.estadoDelTurno = estadoDelTurno;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TurnosTurnoIdBody turnosTurnoIdBody = (TurnosTurnoIdBody) o;
    return Objects.equals(this.usuarioId, turnosTurnoIdBody.usuarioId) &&
        Objects.equals(this.juegoId, turnosTurnoIdBody.juegoId) &&
        Objects.equals(this.estadoDelTurno, turnosTurnoIdBody.estadoDelTurno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usuarioId, juegoId, estadoDelTurno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TurnosTurnoIdBody {\n");
    
    sb.append("    usuarioId: ").append(toIndentedString(usuarioId)).append("\n");
    sb.append("    juegoId: ").append(toIndentedString(juegoId)).append("\n");
    sb.append("    estadoDelTurno: ").append(toIndentedString(estadoDelTurno)).append("\n");
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
