package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import tsis.proyecto.api.dto.JuegoDto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2002
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class InlineResponse2002   {
  @JsonProperty("juegos")
  @Valid
  private List<JuegoDto> juegos = null;

  public InlineResponse2002 juegos(List<JuegoDto> juegos) {
    this.juegos = juegos;
    return this;
  }

  public InlineResponse2002 addJuegosItem(JuegoDto juegosItem) {
    if (this.juegos == null) {
      this.juegos = new ArrayList<JuegoDto>();
    }
    this.juegos.add(juegosItem);
    return this;
  }

  /**
   * Get juegos
   * @return juegos
   **/
  @Schema(description = "")
      @Valid
    public List<JuegoDto> getJuegos() {
    return juegos;
  }

  public void setJuegos(List<JuegoDto> juegos) {
    this.juegos = juegos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.juegos, inlineResponse2002.juegos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(juegos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    juegos: ").append(toIndentedString(juegos)).append("\n");
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
