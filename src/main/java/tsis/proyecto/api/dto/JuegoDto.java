package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JuegoDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class JuegoDto   {
  @JsonProperty("juegoId")
  private Integer juegoId = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("cantidadDeUsuariosMinima")
  private Integer cantidadDeUsuariosMinima = null;

  @JsonProperty("cantidadDeUsuariosMaxima")
  private Integer cantidadDeUsuariosMaxima = null;

  @JsonProperty("logotipo")
  private String logotipo = null;

  @JsonProperty("esperaEntreTurnos")
  private String esperaEntreTurnos = null;

  public JuegoDto juegoId(Integer juegoId) {
    this.juegoId = juegoId;
    return this;
  }

  /**
   * El identificador del juego.
   * @return juegoId
   **/
  @Schema(example = "1234", required = true, description = "El identificador del juego.")
      @NotNull

    public Integer getJuegoId() {
    return juegoId;
  }

  public void setJuegoId(Integer juegoId) {
    this.juegoId = juegoId;
  }

  public JuegoDto nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * El nombre del juego.
   * @return nombre
   **/
  @Schema(example = "Juego1", required = true, description = "El nombre del juego.")
      @NotNull

    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public JuegoDto cantidadDeUsuariosMinima(Integer cantidadDeUsuariosMinima) {
    this.cantidadDeUsuariosMinima = cantidadDeUsuariosMinima;
    return this;
  }

  /**
   * Cantidad de usuarios minima para poder jugar.
   * @return cantidadDeUsuariosMinima
   **/
  @Schema(example = "2", required = true, description = "Cantidad de usuarios minima para poder jugar.")
      @NotNull

    public Integer getCantidadDeUsuariosMinima() {
    return cantidadDeUsuariosMinima;
  }

  public void setCantidadDeUsuariosMinima(Integer cantidadDeUsuariosMinima) {
    this.cantidadDeUsuariosMinima = cantidadDeUsuariosMinima;
  }

  public JuegoDto cantidadDeUsuariosMaxima(Integer cantidadDeUsuariosMaxima) {
    this.cantidadDeUsuariosMaxima = cantidadDeUsuariosMaxima;
    return this;
  }

  /**
   * Cantidad de usuarios máxima para poder jugar.
   * @return cantidadDeUsuariosMaxima
   **/
  @Schema(example = "10", required = true, description = "Cantidad de usuarios máxima para poder jugar.")
      @NotNull

    public Integer getCantidadDeUsuariosMaxima() {
    return cantidadDeUsuariosMaxima;
  }

  public void setCantidadDeUsuariosMaxima(Integer cantidadDeUsuariosMaxima) {
    this.cantidadDeUsuariosMaxima = cantidadDeUsuariosMaxima;
  }

  public JuegoDto logotipo(String logotipo) {
    this.logotipo = logotipo;
    return this;
  }

  /**
   * Ruta del logotipo del juego.
   * @return logotipo
   **/
  @Schema(example = "https://drive.google.com/drive/folders/1-hiP65nxgpan3OoZXQXdCRPT2i6C2YzX", required = true, description = "Ruta del logotipo del juego.")
      @NotNull

    public String getLogotipo() {
    return logotipo;
  }

  public void setLogotipo(String logotipo) {
    this.logotipo = logotipo;
  }

  public JuegoDto esperaEntreTurnos(String esperaEntreTurnos) {
    this.esperaEntreTurnos = esperaEntreTurnos;
    return this;
  }

  /**
   * Tiempo de espera para que un jugador pueda jugar.
   * @return esperaEntreTurnos
   **/
  @Schema(example = "0:05:00", required = true, description = "Tiempo de espera para que un jugador pueda jugar.")
      @NotNull

    public String getEsperaEntreTurnos() {
    return esperaEntreTurnos;
  }

  public void setEsperaEntreTurnos(String esperaEntreTurnos) {
    this.esperaEntreTurnos = esperaEntreTurnos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JuegoDto juegoDto = (JuegoDto) o;
    return Objects.equals(this.juegoId, juegoDto.juegoId) &&
        Objects.equals(this.nombre, juegoDto.nombre) &&
        Objects.equals(this.cantidadDeUsuariosMinima, juegoDto.cantidadDeUsuariosMinima) &&
        Objects.equals(this.cantidadDeUsuariosMaxima, juegoDto.cantidadDeUsuariosMaxima) &&
        Objects.equals(this.logotipo, juegoDto.logotipo) &&
        Objects.equals(this.esperaEntreTurnos, juegoDto.esperaEntreTurnos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(juegoId, nombre, cantidadDeUsuariosMinima, cantidadDeUsuariosMaxima, logotipo, esperaEntreTurnos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JuegoDto {\n");
    
    sb.append("    juegoId: ").append(toIndentedString(juegoId)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    cantidadDeUsuariosMinima: ").append(toIndentedString(cantidadDeUsuariosMinima)).append("\n");
    sb.append("    cantidadDeUsuariosMaxima: ").append(toIndentedString(cantidadDeUsuariosMaxima)).append("\n");
    sb.append("    logotipo: ").append(toIndentedString(logotipo)).append("\n");
    sb.append("    esperaEntreTurnos: ").append(toIndentedString(esperaEntreTurnos)).append("\n");
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
