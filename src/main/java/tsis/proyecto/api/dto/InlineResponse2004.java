package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import tsis.proyecto.api.dto.TurnoDto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2004
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class InlineResponse2004   {
  @JsonProperty("turnos")
  @Valid
  private List<TurnoDto> turnos = null;

  public InlineResponse2004 turnos(List<TurnoDto> turnos) {
    this.turnos = turnos;
    return this;
  }

  public InlineResponse2004 addTurnosItem(TurnoDto turnosItem) {
    if (this.turnos == null) {
      this.turnos = new ArrayList<TurnoDto>();
    }
    this.turnos.add(turnosItem);
    return this;
  }

  /**
   * Get turnos
   * @return turnos
   **/
  @Schema(description = "")
      @Valid
    public List<TurnoDto> getTurnos() {
    return turnos;
  }

  public void setTurnos(List<TurnoDto> turnos) {
    this.turnos = turnos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.turnos, inlineResponse2004.turnos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(turnos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    turnos: ").append(toIndentedString(turnos)).append("\n");
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
