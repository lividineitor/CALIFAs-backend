package tsis.proyecto.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import tsis.proyecto.api.dto.ColaDto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2003
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-05T21:21:27.284150-05:00[America/Mexico_City]")


public class InlineResponse2003   {
  @JsonProperty("colas")
  @Valid
  private List<ColaDto> colas = null;

  public InlineResponse2003 colas(List<ColaDto> colas) {
    this.colas = colas;
    return this;
  }

  public InlineResponse2003 addColasItem(ColaDto colasItem) {
    if (this.colas == null) {
      this.colas = new ArrayList<ColaDto>();
    }
    this.colas.add(colasItem);
    return this;
  }

  /**
   * Get colas
   * @return colas
   **/
  @Schema(description = "")
      @Valid
    public List<ColaDto> getColas() {
    return colas;
  }

  public void setColas(List<ColaDto> colas) {
    this.colas = colas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.colas, inlineResponse2003.colas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    colas: ").append(toIndentedString(colas)).append("\n");
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
