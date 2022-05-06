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
 * PreferenciasPreferenciasIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class PreferenciasPreferenciasIdBody   {
  @JsonProperty("tiempoDeExpiracion")
  private BigDecimal tiempoDeExpiracion = null;

  @JsonProperty("esperaEntreTurnos")
  private String esperaEntreTurnos = null;

  @JsonProperty("tiempoDeSesion")
  private String tiempoDeSesion = null;

  @JsonProperty("urlDestino")
  private String urlDestino = null;

  public PreferenciasPreferenciasIdBody tiempoDeExpiracion(BigDecimal tiempoDeExpiracion) {
    this.tiempoDeExpiracion = tiempoDeExpiracion;
    return this;
  }

  /**
   * El jugador tiene un tiempo limite para permanecer en el sistema sin estar activo.
   * @return tiempoDeExpiracion
   **/
  @Schema(example = "10", description = "El jugador tiene un tiempo limite para permanecer en el sistema sin estar activo.")
  
    @Valid
    public BigDecimal getTiempoDeExpiracion() {
    return tiempoDeExpiracion;
  }

  public void setTiempoDeExpiracion(BigDecimal tiempoDeExpiracion) {
    this.tiempoDeExpiracion = tiempoDeExpiracion;
  }

  public PreferenciasPreferenciasIdBody esperaEntreTurnos(String esperaEntreTurnos) {
    this.esperaEntreTurnos = esperaEntreTurnos;
    return this;
  }

  /**
   * Hay un tiempo entre cada turno.
   * @return esperaEntreTurnos
   **/
  @Schema(example = "5", description = "Hay un tiempo entre cada turno.")
  
    public String getEsperaEntreTurnos() {
    return esperaEntreTurnos;
  }

  public void setEsperaEntreTurnos(String esperaEntreTurnos) {
    this.esperaEntreTurnos = esperaEntreTurnos;
  }

  public PreferenciasPreferenciasIdBody tiempoDeSesion(String tiempoDeSesion) {
    this.tiempoDeSesion = tiempoDeSesion;
    return this;
  }

  /**
   * Tiempo en el que el usuario puede estar dentro del sistema.
   * @return tiempoDeSesion
   **/
  @Schema(example = "20", description = "Tiempo en el que el usuario puede estar dentro del sistema.")
  
    public String getTiempoDeSesion() {
    return tiempoDeSesion;
  }

  public void setTiempoDeSesion(String tiempoDeSesion) {
    this.tiempoDeSesion = tiempoDeSesion;
  }

  public PreferenciasPreferenciasIdBody urlDestino(String urlDestino) {
    this.urlDestino = urlDestino;
    return this;
  }

  /**
   * Dirección del backend.
   * @return urlDestino
   **/
  @Schema(example = "https://google.com", description = "Dirección del backend.")
  
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
    PreferenciasPreferenciasIdBody preferenciasPreferenciasIdBody = (PreferenciasPreferenciasIdBody) o;
    return Objects.equals(this.tiempoDeExpiracion, preferenciasPreferenciasIdBody.tiempoDeExpiracion) &&
        Objects.equals(this.esperaEntreTurnos, preferenciasPreferenciasIdBody.esperaEntreTurnos) &&
        Objects.equals(this.tiempoDeSesion, preferenciasPreferenciasIdBody.tiempoDeSesion) &&
        Objects.equals(this.urlDestino, preferenciasPreferenciasIdBody.urlDestino);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tiempoDeExpiracion, esperaEntreTurnos, tiempoDeSesion, urlDestino);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreferenciasPreferenciasIdBody {\n");
    
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
