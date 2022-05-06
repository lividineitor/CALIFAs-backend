package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PreferenciaDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class PreferenciaDto   {
  @JsonProperty("preferenciasId")
  private Integer preferenciasId = null;

  @JsonProperty("tiempoDeExpiracion")
  private String tiempoDeExpiracion = null;

  @JsonProperty("esperaEntreTurnos")
  private String esperaEntreTurnos = null;

  @JsonProperty("tiempoDeSesion")
  private String tiempoDeSesion = null;

  @JsonProperty("urlDestino")
  private String urlDestino = null;

  public PreferenciaDto preferenciasId(Integer preferenciasId) {
    this.preferenciasId = preferenciasId;
    return this;
  }

  /**
   * El identificador de la preferencia.
   * @return preferenciasId
   **/
  @Schema(example = "1234", required = true, description = "El identificador de la preferencia.")
      @NotNull

    public Integer getPreferenciasId() {
    return preferenciasId;
  }

  public void setPreferenciasId(Integer preferenciasId) {
    this.preferenciasId = preferenciasId;
  }

  public PreferenciaDto tiempoDeExpiracion(String tiempoDeExpiracion) {
    this.tiempoDeExpiracion = tiempoDeExpiracion;
    return this;
  }

  /**
   * Tiempo de Expiracion para el usuario.
   * @return tiempoDeExpiracion
   **/
  @Schema(example = "10", required = true, description = "Tiempo de Expiracion para el usuario.")
      @NotNull

    public String getTiempoDeExpiracion() {
    return tiempoDeExpiracion;
  }

  public void setTiempoDeExpiracion(String tiempoDeExpiracion) {
    this.tiempoDeExpiracion = tiempoDeExpiracion;
  }

  public PreferenciaDto esperaEntreTurnos(String esperaEntreTurnos) {
    this.esperaEntreTurnos = esperaEntreTurnos;
    return this;
  }

  /**
   * Hay un tiempo entre cada turno.
   * @return esperaEntreTurnos
   **/
  @Schema(example = "5", required = true, description = "Hay un tiempo entre cada turno.")
      @NotNull

    public String getEsperaEntreTurnos() {
    return esperaEntreTurnos;
  }

  public void setEsperaEntreTurnos(String esperaEntreTurnos) {
    this.esperaEntreTurnos = esperaEntreTurnos;
  }

  public PreferenciaDto tiempoDeSesion(String tiempoDeSesion) {
    this.tiempoDeSesion = tiempoDeSesion;
    return this;
  }

  /**
   * Tiempo en el que el usuario puede estar dentro del sistema.
   * @return tiempoDeSesion
   **/
  @Schema(example = "20", required = true, description = "Tiempo en el que el usuario puede estar dentro del sistema.")
      @NotNull

    public String getTiempoDeSesion() {
    return tiempoDeSesion;
  }

  public void setTiempoDeSesion(String tiempoDeSesion) {
    this.tiempoDeSesion = tiempoDeSesion;
  }

  public PreferenciaDto urlDestino(String urlDestino) {
    this.urlDestino = urlDestino;
    return this;
  }

  /**
   * Se envia a un destino para realizarse lo establecido.
   * @return urlDestino
   **/
  @Schema(example = "https://fulanitos.org", required = true, description = "Se envia a un destino para realizarse lo establecido.")
      @NotNull

    public String getUrlDestino() {
    return urlDestino;
  }

  public void setUrlDestino(String urlDestino) {
    this.urlDestino = urlDestino;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreferenciaDto preferenciaDto = (PreferenciaDto) o;
    return Objects.equals(this.preferenciasId, preferenciaDto.preferenciasId) &&
        Objects.equals(this.tiempoDeExpiracion, preferenciaDto.tiempoDeExpiracion) &&
        Objects.equals(this.esperaEntreTurnos, preferenciaDto.esperaEntreTurnos) &&
        Objects.equals(this.tiempoDeSesion, preferenciaDto.tiempoDeSesion) &&
        Objects.equals(this.urlDestino, preferenciaDto.urlDestino);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferenciasId, tiempoDeExpiracion, esperaEntreTurnos, tiempoDeSesion, urlDestino);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreferenciaDto {\n");
    
    sb.append("    preferenciasId: ").append(toIndentedString(preferenciasId)).append("\n");
    sb.append("    tiempoDeExpiracion: ").append(toIndentedString(tiempoDeExpiracion)).append("\n");
    sb.append("    esperaEntreTurnos: ").append(toIndentedString(esperaEntreTurnos)).append("\n");
    sb.append("    tiempoDeSesion: ").append(toIndentedString(tiempoDeSesion)).append("\n");
    sb.append("    urlDestino: ").append(toIndentedString(urlDestino)).append("\n");
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
