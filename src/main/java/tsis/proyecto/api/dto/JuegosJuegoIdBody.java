package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JuegosJuegoIdBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class JuegosJuegoIdBody   {
  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("logotipo")
  private String logotipo = null;

  public JuegosJuegoIdBody nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * El nombre del juego.
   * @return nombre
   **/
  @Schema(example = "Juego 1", description = "El nombre del juego.")
  
    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public JuegosJuegoIdBody logotipo(String logotipo) {
    this.logotipo = logotipo;
    return this;
  }

  /**
   * La ruta del logotipo del juego.
   * @return logotipo
   **/
  @Schema(example = "/home/fulanitos/miimage.jpg", description = "La ruta del logotipo del juego.")
  
    public String getLogotipo() {
    return logotipo;
  }

  public void setLogotipo(String logotipo) {
    this.logotipo = logotipo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JuegosJuegoIdBody juegosJuegoIdBody = (JuegosJuegoIdBody) o;
    return Objects.equals(this.nombre, juegosJuegoIdBody.nombre) &&
        Objects.equals(this.logotipo, juegosJuegoIdBody.logotipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, logotipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JuegosJuegoIdBody {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    logotipo: ").append(toIndentedString(logotipo)).append("\n");
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
