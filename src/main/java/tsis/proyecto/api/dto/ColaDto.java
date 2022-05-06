package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import tsis.proyecto.api.dto.ColaDtoTurnos;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ColaDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class ColaDto   {
  @JsonProperty("colaId")
  private BigDecimal colaId = null;

  @JsonProperty("maximoDeJugadores")
  private BigDecimal maximoDeJugadores = null;

  @JsonProperty("teimpoDeExpiracion")
  private String teimpoDeExpiracion = null;

  @JsonProperty("estados")
  @Valid
  private List<String> estados = new ArrayList<String>();

  @JsonProperty("turnos")
  private ColaDtoTurnos turnos = null;

  public ColaDto colaId(BigDecimal colaId) {
    this.colaId = colaId;
    return this;
  }

  /**
   * El identificador de la cola.
   * @return colaId
   **/
  @Schema(example = "1234", required = true, description = "El identificador de la cola.")
      @NotNull

    @Valid
    public BigDecimal getColaId() {
    return colaId;
  }

  public void setColaId(BigDecimal colaId) {
    this.colaId = colaId;
  }

  public ColaDto maximoDeJugadores(BigDecimal maximoDeJugadores) {
    this.maximoDeJugadores = maximoDeJugadores;
    return this;
  }

  /**
   * Número máximo de jugadores en la cola.
   * @return maximoDeJugadores
   **/
  @Schema(example = "20", required = true, description = "Número máximo de jugadores en la cola.")
      @NotNull

    @Valid
    public BigDecimal getMaximoDeJugadores() {
    return maximoDeJugadores;
  }

  public void setMaximoDeJugadores(BigDecimal maximoDeJugadores) {
    this.maximoDeJugadores = maximoDeJugadores;
  }

  public ColaDto teimpoDeExpiracion(String teimpoDeExpiracion) {
    this.teimpoDeExpiracion = teimpoDeExpiracion;
    return this;
  }

  /**
   * TIempo máximo que el jugador puede estar esperando.
   * @return teimpoDeExpiracion
   **/
  @Schema(example = "00:02:00", description = "TIempo máximo que el jugador puede estar esperando.")
  
    public String getTeimpoDeExpiracion() {
    return teimpoDeExpiracion;
  }

  public void setTeimpoDeExpiracion(String teimpoDeExpiracion) {
    this.teimpoDeExpiracion = teimpoDeExpiracion;
  }

  public ColaDto estados(List<String> estados) {
    this.estados = estados;
    return this;
  }

  public ColaDto addEstadosItem(String estadosItem) {
    this.estados.add(estadosItem);
    return this;
  }

  /**
   * El tipo de estado en que pueden estar los turnos.
   * @return estados
   **/
  @Schema(example = "[\"Acvtivo\",\"Disponible\",\"En espera\",\"Expirado\"]", required = true, description = "El tipo de estado en que pueden estar los turnos.")
      @NotNull

    public List<String> getEstados() {
    return estados;
  }

  public void setEstados(List<String> estados) {
    this.estados = estados;
  }

  public ColaDto turnos(ColaDtoTurnos turnos) {
    this.turnos = turnos;
    return this;
  }

  /**
   * Get turnos
   * @return turnos
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ColaDtoTurnos getTurnos() {
    return turnos;
  }

  public void setTurnos(ColaDtoTurnos turnos) {
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
    ColaDto colaDto = (ColaDto) o;
    return Objects.equals(this.colaId, colaDto.colaId) &&
        Objects.equals(this.maximoDeJugadores, colaDto.maximoDeJugadores) &&
        Objects.equals(this.teimpoDeExpiracion, colaDto.teimpoDeExpiracion) &&
        Objects.equals(this.estados, colaDto.estados) &&
        Objects.equals(this.turnos, colaDto.turnos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colaId, maximoDeJugadores, teimpoDeExpiracion, estados, turnos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColaDto {\n");
    
    sb.append("    colaId: ").append(toIndentedString(colaId)).append("\n");
    sb.append("    maximoDeJugadores: ").append(toIndentedString(maximoDeJugadores)).append("\n");
    sb.append("    teimpoDeExpiracion: ").append(toIndentedString(teimpoDeExpiracion)).append("\n");
    sb.append("    estados: ").append(toIndentedString(estados)).append("\n");
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
