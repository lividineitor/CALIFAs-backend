package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V1PptsBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class V1PptsBody   {
  @JsonProperty("usuarioId1")
  private Integer usuarioId1 = null;

  @JsonProperty("usuarioId2")
  private Integer usuarioId2 = null;

  public V1PptsBody usuarioId1(Integer usuarioId1) {
    this.usuarioId1 = usuarioId1;
    return this;
  }

  /**
   * El id del jugador 1.
   * @return usuarioId1
   **/
  @Schema(example = "1", required = true, description = "El id del jugador 1.")
      @NotNull

    public Integer getUsuarioId1() {
    return usuarioId1;
  }

  public void setUsuarioId1(Integer usuarioId1) {
    this.usuarioId1 = usuarioId1;
  }

  public V1PptsBody usuarioId2(Integer usuarioId2) {
    this.usuarioId2 = usuarioId2;
    return this;
  }

  /**
   * El id del jugador 2.
   * @return usuarioId2
   **/
  @Schema(example = "2", required = true, description = "El id del jugador 2.")
      @NotNull

    public Integer getUsuarioId2() {
    return usuarioId2;
  }

  public void setUsuarioId2(Integer usuarioId2) {
    this.usuarioId2 = usuarioId2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PptsBody v1PptsBody = (V1PptsBody) o;
    return Objects.equals(this.usuarioId1, v1PptsBody.usuarioId1) &&
        Objects.equals(this.usuarioId2, v1PptsBody.usuarioId2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usuarioId1, usuarioId2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PptsBody {\n");
    
    sb.append("    usuarioId1: ").append(toIndentedString(usuarioId1)).append("\n");
    sb.append("    usuarioId2: ").append(toIndentedString(usuarioId2)).append("\n");
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
